package co.vinni.soapproyectobase.controladores;



import co.vinni.soapproyectobase.dto.RegistradorDto;
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
@RequestMapping("/api/registrador")
@CrossOrigin(origins = "${spring.webmvc.cors.allowed-origins}",
        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class ControladorRegistradorANG {
    private static final Logger logger = (Logger) LogManager.getLogger(ControladorRegistrador.class);

    private ServicioRegistrador servicioRegistrador;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RegistradorDto>registrarRegistrador(@Validated @RequestBody RegistradorDto entityDto) {
        entityDto = servicioRegistrador.registrarRegistrador(entityDto);

        return new ResponseEntity<>(entityDto, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<RegistradorDto>>consultarRegistradores(){
        return ResponseEntity.ok(servicioRegistrador.consultarRegistradores());
    }

}
