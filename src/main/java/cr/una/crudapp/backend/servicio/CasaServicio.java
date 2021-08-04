package cr.una.crudapp.backend.servicio;

import cr.una.crudapp.backend.excepcion.CasaNotFoundException;
import cr.una.crudapp.backend.modelo.Casa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.una.crudapp.backend.dao.ICasaDAO;

@Service
@Transactional
public class CasaServicio implements ICasaServicio{

    @Autowired
    private ICasaDAO dao;

    @Override
    public Casa encuentraPorId(long casa_id) throws CasaNotFoundException {
        return dao.encuentraPorId(casa_id);
    }
    
    
     @Override
     public double calculaArea(long casa_id) throws CasaNotFoundException {
     double lado=dao.encuentraPorId(casa_id).getLado();
     return lado*lado;
     }
     
     
    /**
     *
     * @param casa La entidad que va a ser creada en la base de datos
     * @return la casa que fue creada en la base de datos
     */
    @Override
    public Casa crear(Casa casa) {
        return dao.crearCasa(casa);
    }
    
}

