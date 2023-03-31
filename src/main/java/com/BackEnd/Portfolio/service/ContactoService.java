
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Contacto;
import com.BackEnd.Portfolio.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IContactoService {
    
    @Autowired
    private ContactoRepository contaRepo; 

    @Override
    public List<Contacto> traerContactos() {
        List<Contacto> listaContactos = contaRepo.findAll();
        return listaContactos;
    }

    @Override
    public String crearContacto(Contacto contacto) {
        contaRepo.save(contacto);
        return "Se ha agregado un nuevo contacto.";
    }

    @Override
    public String borrarContacto(Long id) {
        contaRepo.deleteById(id);
        return "Se ha eliminado un contacto del registro.";
    }

    @Override
    public Contacto traerContacto(Long id) {
        Contacto contacto = contaRepo.findById(id).orElse(null);
        return contacto;
    }

    @Override
    public Contacto editarContacto(Long id, String info) {
        Contacto contacto = contaRepo.findById(id).orElse(null);
        contacto.setInfo(info);
        contaRepo.save(contacto);
        return contacto;
    }
    
}
