
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Herramientas;
import com.BackEnd.Portfolio.service.IHerramientasService;
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
public class ControllerHerramientas {
    
    @Autowired
    private IHerramientasService herraServ;
    
    @GetMapping ("/herramientas/traer")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public List<Herramientas> traerHerramientas() {
        return herraServ.traerHerramientas();
    }
    
    @PostMapping ("/herramientas/crear")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public String crearHerramientas(@RequestBody Herramientas herramientas) {
        return herraServ.crearHerramientas(herramientas);
    }
    
    @DeleteMapping ("/herramientas/borrar/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public String borrarHerramientas(@PathVariable Long id) {
        return herraServ.borrarHerramientas(id);
    }
    
    @GetMapping ("/herramientas/traer/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public Herramientas traerHerramientas(@PathVariable Long id) {
        return herraServ.traerHerramientas(id);
    }
    
    @PutMapping ("/herramientas/editar/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public Herramientas editarHerramientas(@PathVariable Long id, @RequestBody Herramientas herramientas) {
        return herraServ.editarHerramientas(id, herramientas);
    }
    
}
