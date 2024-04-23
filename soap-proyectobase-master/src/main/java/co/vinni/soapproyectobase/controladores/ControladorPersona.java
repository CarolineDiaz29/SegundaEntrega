package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.dto.PersonaDto;
import lombok.extern.log4j.Log4j2;
import co.vinni.soapproyectobase.servicios.ServicioPersona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Log4j2
@Controller
public class ControladorPersona {

    private static final Logger logger = LogManager.getLogger(ControladorPersona.class);

    @Autowired
    ServicioPersona servicioPersona;
    @PostMapping("/persona")
    public String registrarPersona(@ModelAttribute("persona") PersonaDto persona) {
        servicioPersona.registrarPersona(persona);
        return "redirect:/persona";
    }
    @GetMapping({"/persona"})
    public String consultarPersonas(Model model) {
        logger.info("Verificando");
        model.addAttribute("persona", servicioPersona.consultarPersonas());
        return "persona";
    }

    /*public Boolean modificarTipoIdentidadPersona(String nuevoTipoIdentidad, PersonaDto personaDto) {
        personaDto.setTipoDocumentoDto(nuevoTipoIdentidad);
        servicioPersona.modificarpersona(personaDto);
        return true;

    }*/

}
