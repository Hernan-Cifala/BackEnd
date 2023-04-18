
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Habilidad;
import com.BackEnd.Portfolio.service.IHabilidadService;
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
public class ControllerHabilidad {
    
    @Autowired
    private IHabilidadService habiServ;
    
    @GetMapping ("/habilidad/traer")
    public List<Habilidad> traerHabilidades() {
        return habiServ.traerHabilidades();
    }
    
    @PostMapping ("/habilidad/crear")
    public String crearHabilidad(@RequestBody Habilidad habilidad) {
        return habiServ.crearHabilidad(habilidad);
    }
    
    @DeleteMapping ("/habilidad/borrar/{id}")
    public String borrarHabilidad(@PathVariable Long id) {
        return habiServ.borrarHabilidad(id);
    }
    
    @GetMapping ("/habilidad/traer/{id}")
    public Habilidad traerHabilidad(@PathVariable Long id) {
        return habiServ.traerHabilidad(id);
    }
    
    @PutMapping ("/habilidad/editar/{id}")
    public Habilidad editarHabilidad(@PathVariable Long id, @RequestBody Habilidad habilidad) {
        return habiServ.editarHabilidad(id, habilidad);
    }
    
}
