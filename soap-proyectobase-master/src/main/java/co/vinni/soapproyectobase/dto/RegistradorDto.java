package co.vinni.soapproyectobase.dto;

import co.vinni.soapproyectobase.entidades.Persona;
import co.vinni.soapproyectobase.entidades.Registrador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegistradorDto implements Serializable {
    private int seq;
    private PersonaDto registrador;
    private String sede;

}