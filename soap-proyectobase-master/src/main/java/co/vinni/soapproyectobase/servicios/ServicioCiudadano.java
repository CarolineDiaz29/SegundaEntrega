package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.dto.CiudadanoDto;
import co.vinni.soapproyectobase.entidades.Ciudadano;
import co.vinni.soapproyectobase.repositorios.RepositorioCiudadano;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@AllArgsConstructor
@Service
public class ServicioCiudadano implements Serializable {
    private ModelMapper modelMapper;

    private final RepositorioCiudadano repoCiudadano;


    public CiudadanoDto registrarCiudadano(CiudadanoDto ciudadanodto) {
        Ciudadano ciudadano = repoCiudadano.save(modelMapper.map(ciudadanodto, Ciudadano.class));
        return modelMapper.map(ciudadano, CiudadanoDto.class);
    }

    public List<CiudadanoDto> consultarCiudadano(){
        TypeToken<List<CiudadanoDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(repoCiudadano.findAll(), typeToken.getType());
    }
}
