
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Tareas;
import com.BackEnd.Portfolio.repository.TareasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareasService implements ITareasService {
    
    @Autowired
    private TareasRepository tareRepo; 

    @Override
    public List<Tareas> traerTareas() {
        List<Tareas> listaTareas = tareRepo.findAll();
        return listaTareas;
    }

    @Override
    public String crearTareas(Tareas tareas) {
        tareRepo.save(tareas);
        return "Se ha agregado una nueva tarea.";
    }

    @Override
    public String borrarTareas(Long id) {
        tareRepo.deleteById(id);
        return "Se ha eliminado una tarea del registro.";
    }

    @Override
    public Tareas traerTareas(Long id) {
        Tareas tareas = tareRepo.findById(id).orElse(null);
        return tareas;
    }

    @Override
    public Tareas editarTareas(Long id, Tareas tareas) {
        tareas.setId(id);
        tareRepo.save(tareas);
        return tareas;
    }
    
}
