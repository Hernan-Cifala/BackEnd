
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Habilidad;
import com.BackEnd.Portfolio.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{
    
    @Autowired
    private HabilidadRepository habiRepo; 

    @Override
    public List<Habilidad> traerHabilidades() {
        List<Habilidad> listaHabilidades = habiRepo.findAll();
        return listaHabilidades;
    }

    @Override
    public String crearHabilidad(Habilidad habilidad) {
        habiRepo.save(habilidad);
        return "Se ha agregado una nueva habilidad.";
    }

    @Override
    public String borrarHabilidad(Long id) {
        habiRepo.deleteById(id);
        return "Se ha eliminado una habilidad del registro.";
    }

    @Override
    public Habilidad traerHabilidad(Long id) {
        Habilidad habilidad = habiRepo.findById(id).orElse(null);
        return habilidad;
    }

    @Override
    public Habilidad editarHabilidad(Long id, String ruta) {
        Habilidad habilidad = habiRepo.findById(id).orElse(null);
        habilidad.setRuta(ruta);
        habiRepo.save(habilidad);
        return habilidad;
    }
    
}
