package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Ciudadano")
@Table(name = "Ciudadanos")
public class Ciudadano implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CIU_CIUDADANOS")
    @SequenceGenerator(name = "CIU_CIUDADANOS", sequenceName = "CIU_CIUDADANOS", allocationSize = 1)
    @Column(name = "CIU_SEQ", nullable = false)
    private int SEQ;

    @OneToOne
    @JoinColumn(name = "CIU_NACIDO")
    private Persona nacido;

    @OneToOne
    @JoinColumn(name = "CIU_MAMA")
    private Persona mama;

    @OneToOne
    @JoinColumn(name = "CIU_PAPA")
    private Persona papa;



}
