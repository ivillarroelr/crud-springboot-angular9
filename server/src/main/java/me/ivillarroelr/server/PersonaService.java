package me.ivillarroelr.server;

import java.util.List;

/**
 *
 * @author ivill
 */
public interface PersonaService {
    
    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
    
}
