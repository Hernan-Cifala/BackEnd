
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Formacion;
import com.BackEnd.Portfolio.service.IFormacionService;
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
public class ControllerFormacion {
    
    @Autowired
    private IFormacionService formaServ;
    
    @GetMapping ("/formacion/traer")
    public List<Formacion> traerFormaciones() {
        return formaServ.traerFormaciones();
    }
    
    @PostMapping ("/formacion/crear")
    public String crearFormacion(@RequestBody Formacion formacion) {
        return formaServ.crearFormacion(formacion);
    }
    
    @DeleteMapping ("/formacion/borrar/{id}")
    public String borrarFormacion(@PathVariable Long id) {
        return formaServ.borrarFormacion(id);
    }
    
    @GetMapping ("/formacion/traer/{id}")
    public Formacion traerFormacion(@PathVariable Long id) {
        return formaServ.traerFormacion(id);
    }
    
    @PutMapping ("/formacion/editar/{id}")
    public Formacion editarFormacion(@PathVariable Long id, @RequestBody Formacion formacion) {
        return formaServ.editarFormacion(id, formacion);
    }
    
}
