
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public List<Proyecto> traerProyectos();
    
    public String crearProyecto(Proyecto proyecto);
    
    public String borrarProyecto(Long id);
    
    public Proyecto traerProyecto(Long id);
    
    public Proyecto editarProyecto(Long id, Proyecto proyecto);
    
}
