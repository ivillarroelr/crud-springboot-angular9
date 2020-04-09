package me.ivillarroelr.server;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ivill
 */
@Service
public class PersonaServiceImp implements PersonaService {
    @Autowired
    private PersonaRepositorio repositorio;
    
    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Persona add(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona edit(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona delete(int id) {
        Persona p=repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
    
}
