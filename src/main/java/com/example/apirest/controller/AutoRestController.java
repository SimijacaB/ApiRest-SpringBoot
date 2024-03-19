package com.example.apirest.controller;

import com.example.apirest.models.Auto;
import com.example.apirest.service.AutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/autos")
public class AutoRestController {

    private final AutoService autoService;

    public AutoRestController(AutoService autoService) {
        this.autoService = autoService;
    }

    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearAuto(@RequestBody Auto auto){
        autoService.crearAuto(auto);

    }
    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Auto> listarAutos(){
        return autoService.listarAutos();
    }

    @GetMapping(value = "listarPorId/{idAuto}", headers = "Accept=application/json")
    public Optional<Auto> buscarPorId(@PathVariable Long idAuto){
        return autoService.buscarPorid(idAuto);
    }

    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarAuto(@RequestBody Auto auto){
        autoService.actualizarAuto(auto);
    }
    @DeleteMapping(value = "eliminar/{idAuto}", headers = "Accept=application/json")
    public void eliminarAuto(@PathVariable Long idAuto){
        autoService.eliminarAutoPorId(idAuto);
    }

    @GetMapping(value = "listarPorMarca/{marca}")
    public List<Auto> listarPorMarca(@PathVariable String marca){
        return autoService.buscarPorMarca(marca);
    }

    @GetMapping(value = "listarPorModelo/{modelo}", headers = "Accept=application/json")
    public List<Auto> listarPorModelo(@PathVariable String modelo){
        return autoService.buscarPorModelo(modelo);
    }
    @GetMapping(value = "listarPorAnio/{anio}", headers = "Accept=application/json")
    public List<Auto> listarPorAnio(@PathVariable Long anio){
        return autoService.buscarPorAnio(anio);
    }
    @GetMapping(value = "listarPorColor/{color}", headers = "Accept=application/json")
    public List<Auto> listarPorColor(@PathVariable String color){
        return autoService.buscarPorColor(color);
    }


}
