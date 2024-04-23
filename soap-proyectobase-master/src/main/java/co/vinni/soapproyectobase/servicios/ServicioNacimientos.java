package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.dto.NacimientosDto;
import co.vinni.soapproyectobase.entidades.Nacimientos;
import co.vinni.soapproyectobase.repositorios.RepositorioNacimientos;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@AllArgsConstructor
@Service
public class ServicioNacimientos implements Serializable {
    private ModelMapper modelMapper;


    private final RepositorioNacimientos repoNaci;

    public NacimientosDto registrarNacimientos(NacimientosDto nacimientosDto) {
        Nacimientos nacimientos = repoNaci.save(modelMapper.map(nacimientosDto, Nacimientos.class));
        return modelMapper.map(nacimientos, NacimientosDto.class);
    }

    public List<NacimientosDto> consultarNacimientos() {
        TypeToken<List<NacimientosDto>> typeToken = new TypeToken<>(){};
        return modelMapper.map(repoNaci.findAll(), typeToken.getType());
    }

    /*public List<NacimientosDto> consultarNacimientosPorFecha(Date fecha) {
        List<Nacimientos> nacimientosPorFecha = repoNaci.findByFecha(fecha);
        TypeToken<List<NacimientosDto>> typeToken = new TypeToken<>(){};
        return modelMapper.map(nacimientosPorFecha, typeToken.getType());
    }*/

}
