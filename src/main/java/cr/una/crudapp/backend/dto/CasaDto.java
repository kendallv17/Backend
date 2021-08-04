package cr.una.crudapp.backend.dto;


import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class CasaDto {
    private Long id_casa;
    @NotBlank(message = "No ha completado este label")
    private String color;
    @NotBlank(message = "No ha completado este label")
    private String lado;
     @NotBlank(message = "No ha completado este label")
    private String fecha ;
     @NotBlank(message = "No ha completado este label")
    private String estado ;
   
     
}
