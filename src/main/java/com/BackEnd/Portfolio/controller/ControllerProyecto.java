
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Proyecto;
import com.BackEnd.Portfolio.service.IProyectoService;
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
public class ControllerProyecto {
    
    @Autowired
    private IProyectoService proyeServ;
    
    @GetMapping ("/proyecto/traer")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public List<Proyecto> traerProyectos() {
        return proyeServ.traerProyectos();
    }
    
    @PostMapping ("/proyecto/crear")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public String crearProyecto(@RequestBody Proyecto proyecto) {
        return proyeServ.crearProyecto(proyecto);
    }
    
    @DeleteMapping ("/proyecto/borrar/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public String borrarProyecto(@PathVariable Long id) {
        return proyeServ.borrarProyecto(id);
    }
    
    @GetMapping ("/proyecto/traer/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public Proyecto traerProyecto(@PathVariable Long id) {
        return proyeServ.traerProyecto(id);
    }
    
    @PutMapping ("/proyecto/editar/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public Proyecto editarProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto) {
        return proyeServ.editarProyecto(id, proyecto);
    }
    
}
