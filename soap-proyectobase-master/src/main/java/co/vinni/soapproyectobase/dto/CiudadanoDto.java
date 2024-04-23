package co.vinni.soapproyectobase.dto;


import co.vinni.soapproyectobase.entidades.Persona;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CiudadanoDto implements Serializable {
    private int seq;
    private PersonaDto nacido;
    private PersonaDto papa;
    private PersonaDto mama;


}
