
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Formacion;
import java.util.List;

public interface IFormacionService {
    
    public List<Formacion> traerFormaciones();
    
    public String crearFormacion(Formacion formacion);
    
    public String borrarFormacion(Long id);
    
    public Formacion traerFormacion(Long id);
    
    public Formacion editarFormacion(Long id, Formacion formacion);
    
}
