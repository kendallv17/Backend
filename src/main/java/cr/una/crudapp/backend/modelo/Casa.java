package cr.una.crudapp.backend.modelo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "casa" )
public class Casa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_casa")
    @Getter
    @Setter
     private Long id_casa;
    @Column(name = "color")
    @Getter @Setter
    private String color;
       
    @Column(name = "fecha")
    @Getter @Setter
    private Date fecha;
    
    @Column(name = "lado")
    @Getter @Setter
    private double lado;
    
    @Column(name = "estado")
    @Getter @Setter
    private boolean estado;
    
     @OneToOne(mappedBy = "casa")
    private Persona persona;
    
}
