package cr.una.crudapp.backend.webservice;

import cr.una.crudapp.backend.comun.Constants;
import cr.una.crudapp.backend.dto.CasaDto;
import cr.una.crudapp.backend.excepcion.CasaNotFoundException;
import cr.una.crudapp.backend.modelo.Casa;
import cr.una.crudapp.backend.servicio.CasaServicio;
import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@CrossOrigin
@RequestMapping(value = Constants.URL_PREFIX + "casas")
public class CasaController {

    @Autowired(required = false)
    private CasaServicio servicio;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("{casa_id}")
    @ResponseBody
    public CasaDto encuentraPorId(@PathVariable long id_casa) throws CasaNotFoundException {
        Casa usuario = servicio.encuentraPorId(id_casa);
        return convierteADto(usuario);
    }

    private CasaDto convierteADto(Casa casa) {
        CasaDto casaDto = modelMapper.map(casa, CasaDto.class);
        return casaDto;
    }
    
    
        /**
     * Convierte de DTO  a entidad
     * @param casaDto el DTO
     * @return la entidad
     */
    private Casa convierteAEntidad(CasaDto casaDto) {
        Casa casa = modelMapper.map(casaDto, Casa.class);
        return casa;
    }
    
        /**
     * Salva a la nueva Casa
     * @param casaDto la casa salvada
     * @return la entidad convertida a dto en la BD insertada correctamente
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CasaDto salva(@Valid @RequestBody CasaDto casaDto) {
        Casa casa = convierteAEntidad(casaDto);
        return convierteADto(servicio.crear(casa));
    }
}
