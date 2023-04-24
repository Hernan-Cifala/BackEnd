
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Contacto;
import com.BackEnd.Portfolio.service.IContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerContacto {
    
    @Autowired
    private IContactoService contaServ;
    
    @GetMapping ("/contacto/traer")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Contacto> traerContactos() {
        return contaServ.traerContactos();
    }
    
    @PostMapping ("/contacto/crear")
    @CrossOrigin(origins = "http://localhost:4200")
    public String crearContacto(@RequestBody Contacto contacto) {
        return contaServ.crearContacto(contacto);
    }
    
    @DeleteMapping ("/contacto/borrar/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public String borrarContacto(@PathVariable Long id) {
        return contaServ.borrarContacto(id);
    }
    
    @GetMapping ("/contacto/traer/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Contacto traerContacto(@PathVariable Long id) {
        return contaServ.traerContacto(id);
    }
    
    @PutMapping ("/contacto/editar/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Contacto editarContacto(@PathVariable Long id, @RequestBody Contacto contacto) {
        return contaServ.editarContacto(id, contacto);
    }
    
}
