
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Experiencia;
import java.util.Date;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> traerExperiencias();
    
    public String crearExperiencia(Experiencia experiencia);
    
    public String borrarExperiencia(Long id);
    
    public Experiencia traerExperiencia(Long id);
    
    public Experiencia editarExperiencia(Long id, Experiencia experiencia);
    
}
