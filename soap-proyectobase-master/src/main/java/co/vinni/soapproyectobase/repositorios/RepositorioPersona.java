package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RepositorioPersona extends CrudRepository<Persona, Integer>{
    /*@Query("SELECT e FROM Persona e JOIN FETCH n.nacimientos where per_seq = :seq")
    List<Persona> findPersonaAndPersonaNacimientosById(@Param("seq") int seq);*/
}
