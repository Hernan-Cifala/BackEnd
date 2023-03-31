
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Persona;
import com.BackEnd.Portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository persoRepo; 
    
    @Override
    public List<Persona> traerPersonas() {
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public String crearPersona(Persona persona) {
        persoRepo.save(persona);
        return "Se ha agregado una nueva persona.";
    }

    @Override
    public String borrarPersona(Long id) {
        persoRepo.deleteById(id);
        return "Se ha eliminado una persona del registro.";
    }

    @Override
    public Persona traerPersona(Long id) {
        Persona persona = persoRepo.findById(id).orElse(null);
        return persona;
    }

    @Override
    public Persona editarPersona(Long id, String nombre, String apellido, String titulo, String resumen, String email, String contraseña, String foto) {
        Persona persona = persoRepo.findById(id).orElse(null);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setTitulo(titulo);
        persona.setResumen(resumen);
        persona.setEmail(email);
        persona.setContraseña(contraseña);
        persona.setFoto(foto);
        persoRepo.save(persona);
        return persona;
    }
    
    
    
}
