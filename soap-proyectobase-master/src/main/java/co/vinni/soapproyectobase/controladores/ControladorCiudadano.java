package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.dto.CiudadanoDto;
import co.vinni.soapproyectobase.servicios.ServicioCiudadano;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Log4j2
@Controller
public class ControladorCiudadano {

    private static final Logger logger = LogManager.getLogger(ControladorCiudadano.class);

    @Autowired
    ServicioCiudadano servicioCiudadano;
    @PostMapping("/ciudadano")
    public String registrarCiudadano(@ModelAttribute("ciudadano")CiudadanoDto ciudadano) {
        servicioCiudadano.registrarCiudadano(ciudadano);
        return "redirect:/ciudadano";
    }
    @GetMapping({  "/ciudadano"})
    public String consultarCiudadano(Model model) {
        logger.info("Verificando");
        model.addAttribute("ciudadano", servicioCiudadano.consultarCiudadano());
        return "ciudadano";
    }
}
