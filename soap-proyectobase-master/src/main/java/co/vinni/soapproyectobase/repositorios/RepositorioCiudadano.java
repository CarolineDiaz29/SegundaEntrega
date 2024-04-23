package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Ciudadano;
import co.vinni.soapproyectobase.entidades.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RepositorioCiudadano extends CrudRepository<Ciudadano, Integer>{
    /*@Query("SELECT e FROM ciudadanos e JOIN FETCH p.personas where per_seq = :seq")
    List<Persona> findciudadanosAndciudadanospersonasById(@Param("seq") int seq);*/
}
