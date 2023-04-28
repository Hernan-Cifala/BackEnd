
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Conocimientos;
import com.BackEnd.Portfolio.service.IConocimientosService;
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
public class ControllerConocimientos {
    
    @Autowired
    private IConocimientosService conoServ;
    
    @GetMapping ("/conocimientos/traer")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public List<Conocimientos> traerConocimientos() {
        return conoServ.traerConocimientos();
    }
    
    @PostMapping ("/conocimientos/crear")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public String crearConocimientos(@RequestBody Conocimientos conocimientos) {
        return conoServ.crearConocimientos(conocimientos);
    }
    
    @DeleteMapping ("/conocimientos/borrar/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public String borrarConocimientos(@PathVariable Long id) {
        return conoServ.borrarConocimientos(id);
    }
    
    @GetMapping ("/conocimientos/traer/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public Conocimientos traerConocimientos(@PathVariable Long id) {
        return conoServ.traerConocimientos(id);
    }
    
    @PutMapping ("/conocimientos/editar/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public Conocimientos editarConocimientos(@PathVariable Long id, @RequestBody Conocimientos conocimientos) {
        return conoServ.editarConocimientos(id, conocimientos);
    }
    
}
