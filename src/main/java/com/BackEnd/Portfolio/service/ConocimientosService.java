
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Conocimientos;
import com.BackEnd.Portfolio.repository.ConocimientosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConocimientosService implements IConocimientosService {
    
    @Autowired
    private ConocimientosRepository conoRepo; 

    @Override
    public List<Conocimientos> traerConocimientos() {
        List<Conocimientos> listaConocimientos = conoRepo.findAll();
        return listaConocimientos;
    }

    @Override
    public String crearConocimientos(Conocimientos conocimientos) {
        conoRepo.save(conocimientos);
        return "Se ha agregado un nuevo conocimiento.";
    }

    @Override
    public String borrarConocimientos(Long id) {
        conoRepo.deleteById(id);
        return "Se ha eliminado un conocimiento del registro.";
    }

    @Override
    public Conocimientos traerConocimientos(Long id) {
        Conocimientos conocimientos = conoRepo.findById(id).orElse(null);
        return conocimientos;
    }

    @Override
    public Conocimientos editarConocimientos(Long id, Conocimientos conocimientos) {
        conocimientos.setId(id);
        conoRepo.save(conocimientos);
        return conocimientos;
    }
    
}
