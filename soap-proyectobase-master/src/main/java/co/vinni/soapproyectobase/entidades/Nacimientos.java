package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Nacimiento")
@Table(name = "NACIMIENTOS")
public class Nacimientos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NAC_NACIMIENTOS")
    @SequenceGenerator(name = "NAC_NACIMIENTOS", sequenceName = "NAC_NACIMIENTOS", allocationSize = 1)
    @Column(name = "NAC_ID", nullable = false)
    private int id;
    @Column(name = "NAC_FECHA", nullable = false)
    private LocalDate fecha;


    @OneToOne
    @JoinColumn(name = "NAC_PERSONA")
    private Persona persona;

    @OneToOne
    @JoinColumn(name = "NAC_REGISTRADOR")
    private Registrador registrador;



}
