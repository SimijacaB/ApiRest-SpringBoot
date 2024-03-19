package com.example.apirest.repository;

import com.example.apirest.models.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAutoRepository extends JpaRepository <Auto,Long> {

    List<Auto> findByMarca(String marca);
    List<Auto> findByColor(String color);
    List<Auto> findByModelo(String modelo);

    List<Auto> findByAnio(Long anio);
}
