
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Conocimientos;
import java.util.List;

public interface IConocimientosService {
    
    public List<Conocimientos> traerConocimientos();
    
    public String crearConocimientos(Conocimientos conocimientos);
    
    public String borrarConocimientos(Long id);
    
    public Conocimientos traerConocimientos(Long id);
    
    public Conocimientos editarConocimientos(Long id, Conocimientos conocimientos);
    
}
