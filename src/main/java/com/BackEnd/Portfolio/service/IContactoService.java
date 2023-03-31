
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Contacto;
import java.util.List;

public interface IContactoService {
    
    public List<Contacto> traerContactos();
    
    public String crearContacto(Contacto contacto);
    
    public String borrarContacto(Long id);
    
    public Contacto traerContacto(Long id);
    
    public Contacto editarContacto(Long id, String info);
    
}
