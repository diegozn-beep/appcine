package com.example.appcine.repositorio;

import com.example.appcine.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer> {
}
