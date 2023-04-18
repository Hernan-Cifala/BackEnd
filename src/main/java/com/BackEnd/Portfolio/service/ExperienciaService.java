
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Experiencia;
import com.BackEnd.Portfolio.repository.ExperienciaRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    private ExperienciaRepository expeRepo; 

    @Override
    public List<Experiencia> traerExperiencias() {
        List<Experiencia> listaExperiencias = expeRepo.findAll();
        return listaExperiencias;
    }

    @Override
    public String crearExperiencia(Experiencia experiencia) {
        expeRepo.save(experiencia);
        return "Se ha agregado una nueva experiencia.";
    }

    @Override
    public String borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
        return "Se ha eliminado una experiencia del registro.";
    }

    @Override
    public Experiencia traerExperiencia(Long id) {
        Experiencia experiencia = expeRepo.findById(id).orElse(null);
        return experiencia;
    }

    @Override
    public Experiencia editarExperiencia(Long id, Experiencia experiencia) {
        experiencia.setId(id);
        expeRepo.save(experiencia);
        return experiencia;
    }
    
}
