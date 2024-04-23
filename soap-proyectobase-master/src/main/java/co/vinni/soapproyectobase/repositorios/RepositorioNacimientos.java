package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Nacimientos;
import co.vinni.soapproyectobase.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RepositorioNacimientos extends CrudRepository<Nacimientos, Integer>{
    /*@Query("SELECT e FROM nacimientos e JOIN FETCH p.personas where per_seq = :seq")
    List<Persona> findnacimientosAndnacimientospersonasById(@Param("seq") int seq);*/
}
