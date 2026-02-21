package com.example.appcine.controlador;

import com.example.appcine.modelos.Asiento;
import com.example.appcine.repositorio.AsientoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/asiento")
public class AsientoControlador {

    @Autowired
    AsientoRepositorio repo;

    @GetMapping("/lista/{codigoPelicula}")
    public List<Asiento> listByPelicula(@PathVariable int codigoPelicula) {
        return repo.findByCodigoPelicula(codigoPelicula);
    }

    @PutMapping("/ocupar/{codigo}")
    public Asiento ocupar(@PathVariable int codigo) {
        Asiento a = repo.findById(codigo).orElse(null);
        if (a != null) {
            a.setOcupado(true);
            repo.save(a);
        }
        return a;
    }
}