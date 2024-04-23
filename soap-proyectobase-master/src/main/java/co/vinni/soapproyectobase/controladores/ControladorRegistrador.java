package co.vinni.soapproyectobase.controladores;


import co.vinni.soapproyectobase.dto.PersonaDto;
import co.vinni.soapproyectobase.dto.RegistradorDto;
import co.vinni.soapproyectobase.entidades.Registrador;
import co.vinni.soapproyectobase.servicios.ServicioRegistrador;
import lombok.extern.log4j.Log4j2;
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
public class ControladorRegistrador {

    private static final Logger logger = LogManager.getLogger(ControladorRegistrador.class);

    @Autowired
    ServicioRegistrador servicioRegistrador;
    @PostMapping("/registrador")
    public String registrarRegistrador(@ModelAttribute("registrador") RegistradorDto registrador) {
        servicioRegistrador.registrarRegistrador(registrador);
        return "redirect:/registrador";
    }
    @GetMapping({  "/registrador"})
    public String consultarRegistradores(Model model){
        logger.info("Verificando");
        model.addAttribute("registrador", servicioRegistrador.consultarRegistradores());
        return "registrador";
    }


}
