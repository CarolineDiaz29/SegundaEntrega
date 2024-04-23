package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.dto.RegistradorDto;
import co.vinni.soapproyectobase.entidades.Registrador;
import co.vinni.soapproyectobase.repositorios.RepositorioRegistrador;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@AllArgsConstructor
@Service
public class ServicioRegistrador implements Serializable {
    private ModelMapper modelMapper;


    private final RepositorioRegistrador repoRegis;


    public RegistradorDto registrarRegistrador(RegistradorDto registradorDto) {
        Registrador registrador = repoRegis.save(modelMapper.map(registradorDto, Registrador.class));
        return modelMapper.map(registrador, RegistradorDto.class);
    }

    public List<RegistradorDto> consultarRegistradores() {
        TypeToken<List<RegistradorDto>> typeToken = new TypeToken<>(){};
        return modelMapper.map(repoRegis.findAll(), typeToken.getType());
    }
}
