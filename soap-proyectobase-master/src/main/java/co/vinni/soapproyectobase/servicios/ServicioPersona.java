package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.dto.PersonaDto;
import co.vinni.soapproyectobase.entidades.Persona;
import co.vinni.soapproyectobase.exception.ResourceNotFoundException;
import co.vinni.soapproyectobase.repositorios.RepositorioPersona;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@AllArgsConstructor
@Service
public class ServicioPersona implements Serializable {

    private ModelMapper modelMapper;

    private final RepositorioPersona repoPersona;


    public PersonaDto registrarPersona(PersonaDto personadto) {
        Persona persona = repoPersona.save(modelMapper.map(personadto, Persona.class));
        return modelMapper.map(persona, PersonaDto.class);
    }

    /*public PersonaDto consultarPersona(int documento) {
        TypeToken<List<PersonaDto>> typeToken = new TypeToken<>(){};
        return modelMapper.map(repoPersona.findById(documento), typeToken.getType());
    }*/

    public List<PersonaDto> consultarPersonas(){
        TypeToken<List<PersonaDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(repoPersona.findAll(), typeToken.getType());
    }


    public PersonaDto modificarpersona(PersonaDto personaDto) {
        repoPersona.save(modelMapper.map(personaDto, Persona.class));
        return personaDto;
    }

    /*private boolean existePersonaConDocumento(int documento) {
        return repoPersona.existsById(documento);
    }*/
}
