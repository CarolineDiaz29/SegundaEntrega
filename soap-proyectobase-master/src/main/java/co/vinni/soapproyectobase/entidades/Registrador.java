package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Registrador")
@Table(name = "REGISTRADORES")
public class Registrador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REG_REGISTRADORES")
    @SequenceGenerator(name = "REG_REGISTADORES", sequenceName = "REG_REGISTRADORES", allocationSize = 1)
    @Column(name = "REG_SEQ", nullable = false)
    private int seq;
    @Column(name = "REG_SEDE", nullable = false)
    private String sede;

    @OneToOne
    @JoinColumn(name = "REG_REGISTRADOR")
    private Persona persona;


}
