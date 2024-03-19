package com.example.apirest.service;

import com.example.apirest.models.Auto;
import com.example.apirest.repository.IAutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoService {

    private final IAutoRepository autoRepository;

    public AutoService(IAutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public void crearAuto(Auto auto){
        autoRepository.save(auto);
    }
    //Metodo para buscar un auto pi id especifico
    public Optional<Auto> buscarPorid(Long idAuto){
        return  autoRepository.findById(idAuto);
    }

    //Metodo para actualizar auto
    public void actualizarAuto(Auto auto){
        autoRepository.save(auto);
    }

    //Metodo para eliminar un auto
    public void eliminarAutoPorId(Long idAuto){
        autoRepository.deleteById(idAuto);
    }


    //Metodos para buscar segun atributos propios de la clase
    public List<Auto> buscarPorMarca(String marca){
        return autoRepository.findByMarca(marca);
    }
    public List<Auto> buscarPorColor(String color){
        return autoRepository.findByColor(color);
    }
    public List<Auto> buscarPorModelo(String modelo){
        return autoRepository.findByModelo(modelo);
    }
    public List<Auto> buscarPorAnio(Long anio){
        return autoRepository.findByAnio(anio);
    }

    public List<Auto> listarAutos() { return autoRepository.findAll();
    }
}
