package co.vinni.soapproyectobase.controladores;


import co.vinni.soapproyectobase.dto.NacimientosDto;
import co.vinni.soapproyectobase.dto.PersonaDto;
import co.vinni.soapproyectobase.entidades.Nacimientos;
import co.vinni.soapproyectobase.servicios.ServicioNacimientos;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;


@Log4j2
public class ControladorNacimientos {
    private static final Logger logger = LogManager.getLogger(ControladorNacimientos.class);

    @Autowired
    ServicioNacimientos servicioNacimientos;
    @PostMapping("/nacimientos")
    public String registrarNacimientos(@ModelAttribute("nacimientos") NacimientosDto nacimientos) {
        servicioNacimientos.registrarNacimientos(nacimientos);
        return "redirect:/nacimientos";
    }
    @GetMapping({  "/nacimientos"})
    public String consultarNacimientos(Model model){
        logger.info("Verificando");
        model.addAttribute("nacimientos", servicioNacimientos.consultarNacimientos());
        return "nacimientos";
    }
    /*public List<NacimientosDto> consultarNacimientosporFecha(Date fecha){
        return servicioNacimientos.consultarNacimientosPorFecha(fecha);
    }*/



}
