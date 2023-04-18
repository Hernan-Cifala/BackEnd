
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Tareas;
import java.util.List;

public interface ITareasService {
    
    public List<Tareas> traerTareas();
    
    public String crearTareas(Tareas tareas);
    
    public String borrarTareas(Long id);
    
    public Tareas traerTareas(Long id);
    
    public Tareas editarTareas(Long id, Tareas tareas);
    
}
