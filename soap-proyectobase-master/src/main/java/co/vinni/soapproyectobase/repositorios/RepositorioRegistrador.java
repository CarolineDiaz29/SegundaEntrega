package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Persona;
import co.vinni.soapproyectobase.entidades.Registrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RepositorioRegistrador extends CrudRepository<Registrador, Integer>{
    /*@Query("SELECT e FROM registrador e JOIN FETCH p.personas where per_seq = :seq")
    List<Persona> findregistradorAndregistradorpersonasById(@Param("seq") int seq);*/
}
