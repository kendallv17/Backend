package cr.una.crudapp.backend.dto;
import cr.una.crudapp.backend.modelo.Casa;
import lombok.Data;
import javax.validation.constraints.NotBlank;

/**
 *
 * DTO para la entidad Persona
 *
 */


@Data
public class PersonaDto {
   
    private Long idPersona;
    @NotBlank(message = "No ha completado este label")
    private String nombre;
    @NotBlank(message = "No ha completado este label")
    private String numCedula;
    private Casa casa;
    
   
}
