package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.dto.CiudadanoDto;
import co.vinni.soapproyectobase.dto.RegistradorDto;
import co.vinni.soapproyectobase.servicios.ServicioCiudadano;
import co.vinni.soapproyectobase.servicios.ServicioRegistrador;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Log4j2
@AllArgsConstructor
@RestController
@RequestMapping("/api/ciudadano")
@CrossOrigin(origins = "${spring.webmvc.cors.allowed-origins}",
        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class ControladorCiudadanoANG {
    private static final Logger logger = (Logger) LogManager.getLogger(ControladorCiudadano.class);

    private ServicioCiudadano servicioCiudadano;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CiudadanoDto> registrarCiudadano(@Validated @RequestBody CiudadanoDto entityDto) {
        entityDto = servicioCiudadano.registrarCiudadano(entityDto);

        return new ResponseEntity<>(entityDto, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<CiudadanoDto>> consultarCiudadano(){
        return ResponseEntity.ok(servicioCiudadano.consultarCiudadano());
    }
}
