
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Tareas;
import com.BackEnd.Portfolio.service.ITareasService;
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
public class ControllerTareas {
    
    @Autowired
    private ITareasService tareServ;
    
    @GetMapping ("/tareas/traer")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Tareas> traerTareas() {
        return tareServ.traerTareas();
    }
    
    @PostMapping ("/tareas/crear")
    @CrossOrigin(origins = "http://localhost:4200")
    public String crearTareas(@RequestBody Tareas tareas) {
        return tareServ.crearTareas(tareas);
    }
    
    @DeleteMapping ("/tareas/borrar/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public String borrarTareas(@PathVariable Long id) {
        return tareServ.borrarTareas(id);
    }
    
    @GetMapping ("/tareas/traer/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Tareas traerTareas(@PathVariable Long id) {
        return tareServ.traerTareas(id);
    }
    
    @PutMapping ("/tareas/editar/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Tareas editarTareas(@PathVariable Long id, @RequestBody Tareas tareas) {
        return tareServ.editarTareas(id, tareas);
    }
    
}
