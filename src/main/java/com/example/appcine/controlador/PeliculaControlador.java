package com.example.appcine.controlador;

import com.example.appcine.modelos.Pelicula;
import com.example.appcine.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pelicula")
public class PeliculaControlador {

    @Autowired
    PeliculaRepositorio repo;

    // ✅ Solo este es necesario por si acaso
    @GetMapping("/lista")
    public List<Pelicula> listAll() {
        return repo.findAll();
    }
}