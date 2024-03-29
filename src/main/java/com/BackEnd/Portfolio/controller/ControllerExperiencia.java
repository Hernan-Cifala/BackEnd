
package com.BackEnd.Portfolio.controller;

import com.BackEnd.Portfolio.model.Experiencia;
import com.BackEnd.Portfolio.service.IExperienciaService;
import java.util.Date;
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
public class ControllerExperiencia {
    
    @Autowired
    private IExperienciaService expeServ;
    
    @GetMapping ("/experiencia/traer")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public List<Experiencia> traerExperiencias() {
        return expeServ.traerExperiencias();
    }
    
    @PostMapping ("/experiencia/crear")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public String crearExperiencia(@RequestBody Experiencia experiencia) {
        return expeServ.crearExperiencia(experiencia);
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public String borrarExperiencia(@PathVariable Long id) {
        return expeServ.borrarExperiencia(id);
    }
    
    @GetMapping ("/experiencia/traer/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public Experiencia traerExperiencia(@PathVariable Long id) {
        return expeServ.traerExperiencia(id);
    }
    
    @PutMapping ("/experiencia/editar/{id}")
    @CrossOrigin ("https://hernan-cifala-portfolio.web.app")
    public Experiencia editarExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia) {
        return expeServ.editarExperiencia(id, experiencia);
    }
    
}
