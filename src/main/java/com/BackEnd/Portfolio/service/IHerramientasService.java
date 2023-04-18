
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Herramientas;
import java.util.List;

public interface IHerramientasService {
    
    public List<Herramientas> traerHerramientas();
    
    public String crearHerramientas(Herramientas herramientas);
    
    public String borrarHerramientas(Long id);
    
    public Herramientas traerHerramientas(Long id);
    
    public Herramientas editarHerramientas(Long id, Herramientas herramientas);
    
}
