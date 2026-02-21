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

    @GetMapping("/lista")
    public List<Pelicula> listAll() {
        return repo.findAll();
    }

    @GetMapping("/buscar/{codigo}")
    public Pelicula findByCodigo(@PathVariable int codigo) {
        return repo.findById(codigo).orElse(null);
    }

    @PostMapping("/registrar")
    public Pelicula save(@RequestBody Pelicula bean) {
        return repo.save(bean);
    }

    @PutMapping("/actualizar")
    public Pelicula update(@RequestBody Pelicula bean) {
        return repo.save(bean);
    }

    @DeleteMapping("/eliminar/{codigo}")
    public void deleteByCodigo(@PathVariable int codigo) {
        repo.deleteById(codigo);
    }
}