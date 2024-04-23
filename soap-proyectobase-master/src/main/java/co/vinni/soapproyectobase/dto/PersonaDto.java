package co.vinni.soapproyectobase.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonaDto implements Serializable {
    private int seq;
    private long documento;
    private String tipoDocumento;
    private String primerApellido;
    private String segundoApellido;
    private String nombres;
    private LocalDate fechadeNacimiento;
    private String lugardeNacimiento;
    private String sexo;
    private String rh;


}
