
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Proyecto;
import com.BackEnd.Portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    private ProyectoRepository proyeRepo; 

    @Override
    public List<Proyecto> traerProyectos() {
        List<Proyecto> listaProyectos = proyeRepo.findAll();
        return listaProyectos;
    }

    @Override
    public String crearProyecto(Proyecto proyecto) {
        proyeRepo.save(proyecto);
        return "Se ha agregado un nuevo proyecto.";
    }

    @Override
    public String borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
        return "Se ha eliminado un proyecto del registro.";
    }

    @Override
    public Proyecto traerProyecto(Long id) {
        Proyecto proyecto = proyeRepo.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public Proyecto editarProyecto(Long id, Proyecto proyecto) {
        proyecto.setId(id);
        proyeRepo.save(proyecto);
        return proyecto;
    }
    
}
