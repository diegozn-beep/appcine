package com.example.appcine.controlador;

import com.example.appcine.modelos.Boleta;
import com.example.appcine.repositorio.BoletaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/boleta")
public class BoletaControlador {

    @Autowired
    BoletaRepositorio repo;

    @GetMapping("/lista")
    public List<Boleta> listAll() {
        return repo.findAll();
    }

    @PostMapping("/registrar")
    public Boleta save(@RequestBody Boleta bean) {
        return repo.save(bean);
    }
}