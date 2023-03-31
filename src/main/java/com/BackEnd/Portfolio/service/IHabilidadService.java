
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    
    public List<Habilidad> traerHabilidades();
    
    public String crearHabilidad(Habilidad habilidad);
    
    public String borrarHabilidad(Long id);
    
    public Habilidad traerHabilidad(Long id);
    
    public Habilidad editarHabilidad(Long id, String ruta);
    
}
