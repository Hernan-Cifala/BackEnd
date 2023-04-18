
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> traerPersonas();
    
    public String crearPersona(Persona persona);
    
    public String borrarPersona(Long id);
    
    public Persona traerPersona(Long id);
    
    public Persona editarPersona(Long id, Persona persona);
    
}
