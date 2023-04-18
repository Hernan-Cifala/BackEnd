
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Herramientas;
import com.BackEnd.Portfolio.repository.HerramientasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HerramientasService implements IHerramientasService {

    @Autowired
    private HerramientasRepository herraRepo;
    
    @Override
    public List<Herramientas> traerHerramientas() {
        List<Herramientas> listaHerramientas = herraRepo.findAll();
        return listaHerramientas;
    }

    @Override
    public String crearHerramientas(Herramientas herramientas) {
        herraRepo.save(herramientas);
        return "Se ha agregado una nueva herramienta.";
    }

    @Override
    public String borrarHerramientas(Long id) {
        herraRepo.deleteById(id);
        return "Se ha eliminado una herramienta del registro.";
    }

    @Override
    public Herramientas traerHerramientas(Long id) {
        Herramientas herramientas = herraRepo.findById(id).orElse(null);
        return herramientas;
    }

    @Override
    public Herramientas editarHerramientas(Long id, Herramientas herramientas) {
        herramientas.setId(id);
        herraRepo.save(herramientas);
        return herramientas;
    }
    
}
