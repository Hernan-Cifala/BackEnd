
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Proyecto;
import com.BackEnd.Portfolio.service.IProyectoService;
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
public class ControllerProyecto {
    
    @Autowired
    private IProyectoService proyeServ;
    
    @GetMapping ("/proyecto/traer")
    public List<Proyecto> traerProyectos() {
        return proyeServ.traerProyectos();
    }
    
    @PostMapping ("/proyecto/crear")
    public String crearProyecto(@RequestBody Proyecto proyecto) {
        return proyeServ.crearProyecto(proyecto);
    }
    
    @DeleteMapping ("/proyecto/borrar/{id}")
    public String borrarProyecto(@PathVariable Long id) {
        return proyeServ.borrarProyecto(id);
    }
    
    @GetMapping ("/proyecto/traer/{id}")
    public Proyecto traerProyecto(@PathVariable Long id) {
        return proyeServ.traerProyecto(id);
    }
    
    @PutMapping ("/proyecto/editar")
    public Proyecto editarProyecto(@RequestParam Long id, @RequestParam String titulo, @RequestParam String subtitulo, @RequestParam String descripcion) {
        return proyeServ.editarProyecto(id, titulo, subtitulo, descripcion);
    }
    
}
