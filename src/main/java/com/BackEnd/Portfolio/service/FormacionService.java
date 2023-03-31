
package com.BackEnd.Portfolio.service;

import com.BackEnd.Portfolio.model.Formacion;
import com.BackEnd.Portfolio.repository.FormacionRepository;
import java.util.List;
import jdk.jfr.SettingDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionService implements IFormacionService{
    
    @Autowired
    private FormacionRepository formaRepo; 

    @Override
    public List<Formacion> traerFormaciones() {
        List<Formacion> listaFormaciones = formaRepo.findAll();
        return listaFormaciones;
    }

    @Override
    public String crearFormacion(Formacion formacion) {
        formaRepo.save(formacion);
        return "Se ha agregado una nueva formación.";
    }

    @Override
    public String borrarFormacion(Long id) {
        formaRepo.deleteById(id);
        return "Se ha eliminado una formación del registro.";
    }

    @Override
    public Formacion traerFormacion(Long id) {
        Formacion formacion = formaRepo.findById(id).orElse(null);
        return formacion;
    }

    @Override
    public Formacion editarFormacion(Long id, String nombre, String descripcion, String certificacion) {
        Formacion formacion = formaRepo.findById(id).orElse(null);
        formacion.setNombre(nombre);
        formacion.setDescripcion(descripcion);
        formacion.setCertificacion(certificacion);
        formaRepo.save(formacion);
        return formacion;
    }
    
}
