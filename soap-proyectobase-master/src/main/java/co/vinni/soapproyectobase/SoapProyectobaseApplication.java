package co.vinni.soapproyectobase;

import co.vinni.soapproyectobase.controladores.ControladorCiudadano;
import co.vinni.soapproyectobase.controladores.ControladorPersona;
import co.vinni.soapproyectobase.controladores.ControladorRegistrador;
import co.vinni.soapproyectobase.controladores.ControladorNacimientos;
import co.vinni.soapproyectobase.dto.*;
import co.vinni.soapproyectobase.entidades.*;
import co.vinni.soapproyectobase.repositorios.RepositorioCiudadano;
import co.vinni.soapproyectobase.repositorios.RepositorioPersona;
import co.vinni.soapproyectobase.repositorios.RepositorioNacimientos;
import co.vinni.soapproyectobase.repositorios.RepositorioRegistrador;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.time.LocalDate;

@SpringBootApplication
@Log4j2
public class SoapProyectobaseApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(SoapProyectobaseApplication.class, args);
        System.out.println("proyecto base");

    }

    @Autowired
    RepositorioPersona repoPersona;
    @Autowired
    RepositorioRegistrador repoRegis;
    @Autowired
    RepositorioNacimientos repoNaci;
    @Autowired
    RepositorioCiudadano repoCiu;

    @Override
    public void run(String... arg) throws Exception{
        LocalDate date = LocalDate.of(2004, 2, 29);
        LocalDate date2 = LocalDate.of(2004, 3, 2);
        LocalDate date1 = LocalDate.of(1985, 1, 1);
        LocalDate date3 = LocalDate.of(1984, 5, 7);
        LocalDate date4 = LocalDate.of(2003, 4, 17);
        LocalDate date5 = LocalDate.of(1985, 1, 20);
        LocalDate date6 = LocalDate.of(1984, 5, 17);
        LocalDate date7 = LocalDate.of(2003, 4, 20);



        Persona p = new Persona(1,1023861049L,"RC","Diaz", "Sarmiento","Yipsi Caroline", date, "Bogota", "F", "O+");
        Persona mama = new Persona(2, 53049306L, "CC", "Sarmiento", "Corredor", "Ingrid", date1,"Bogota", "F", "O+");
        Persona papa = new Persona(3, 80808078L, "CC", "Diaz", "Vargas", "Fredy", date3,"Bogota", "M", "O+");
        Persona registrador1 = new Persona(4, 1000287921L, "CC", "Montes", "Gonzalez", "Bryan ", date4,"Bogota", "M", "O+");

        repoPersona.save(p);
        repoPersona.save(mama);
        repoPersona.save(papa);
        repoPersona.save(registrador1);

        Ciudadano c = new Ciudadano(1,p, mama, papa);

        repoCiu.save(c);

        Registrador r = new Registrador(1,"San Cristobal", registrador1);
        repoRegis.save(r);

        Nacimientos n = new Nacimientos(1,date2,p,r);
        repoNaci.save(n);

    }


}

