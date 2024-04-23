package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Persona")
@Table(name = "PERSONAS")
@ToString
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PER_PERSONAS")
    @SequenceGenerator(name = "PER_PERSONAS", sequenceName = "PER_PERSONAS", allocationSize = 1)
    @Column(name = "PER_SEQ", nullable = false)
    private int seq;
    @Column(name = "PER_DOCUMENTO", nullable = false)
    private Long documento;
    @Column(name = "PER_TIPODOCUMENTO",nullable = false)
    private String tipoDocumento;
    @Column(name = "PER_PRIMERAPELLIDO", nullable = false)
    private String primerApellido;
    @Column(name = "PER_SEGUNDOAPELLIDO", nullable = false)
    private String segundoApellido;
    @Column(name = "PER_NOMBRES", nullable = false)
    private String nombres;
    @Column(name = "PER_FechaDeNacimiento", nullable = false)
    private LocalDate fechadeNacimiento;
    @Column(name = "PER_LUGARDENACIMIENTO", nullable = false)
    private String lugardeNacimiento;
    @Column(name = "PER_SEXO", nullable = false)
    private String sexo;
    @Column(name = "PER_RH", nullable = false)
    private String rh;


}

