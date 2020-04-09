package me.ivillarroelr.server;

import java.util.List;
import org.springframework.data.repository.Repository;


/**
 *
 * @author ivill
 */
public interface PersonaRepositorio extends Repository<Persona, Integer>{
    
    List<Persona> findAll();
    Persona findById(int id);
    Persona save(Persona p);
    void delete(Persona p);
    
}
