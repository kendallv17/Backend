package cr.una.crudapp.backend.modelo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 *
 * Entidad Persona
 *
 */

@Entity
@Table( name = "persona" )
public class Persona {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    @Getter @Setter
    private Long idPersona;
    @Column(name = "nombre")
    @Getter @Setter
    private String nombre;
    @Column(name = "numCedula")
    @Getter @Setter
    private String numCedula;
    
        @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "casa", referencedColumnName = "id_casa")
        @Getter @Setter
    private Casa casa;

}