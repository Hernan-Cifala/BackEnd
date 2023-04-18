
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Persona;
import com.BackEnd.Portfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPersona {
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping ("/persona/traer")
    public List<Persona> traerPersonas() {
        return persoServ.traerPersonas();
    }
    
    @PostMapping ("/persona/crear")
    public String crearPersona(@RequestBody Persona persona) {
        return persoServ.crearPersona(persona);
    }
    
    @DeleteMapping ("/persona/borrar/{id}")
    public String borrarPersona(@PathVariable Long id) {
        return persoServ.borrarPersona(id);
    }
    
    @GetMapping ("/persona/traer/{id}")
    public Persona traerPersona(@PathVariable Long id) {
        return persoServ.traerPersona(id);
    }
    
    @PutMapping ("/persona/editar/{id}")
    public Persona editarPersona(@PathVariable Long id, @RequestBody Persona persona) {
        return persoServ.editarPersona(id, persona);
    }
    
}
