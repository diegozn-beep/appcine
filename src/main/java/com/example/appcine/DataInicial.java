package com.example.appcine;

import com.example.appcine.modelos.Pelicula;
import com.example.appcine.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInicial implements CommandLineRunner {

    @Autowired
    PeliculaRepositorio repo;

    @Override
    public void run(String... args) throws Exception {
        Pelicula p1 = new Pelicula();
        p1.setTitulo("Spider-Man");
        p1.setGenero("Acción");
        p1.setDuracion(148);
        p1.setDescripcion("Spider-Man debe enfrentarse a nuevos desafíos");
        repo.save(p1);

        Pelicula p2 = new Pelicula();
        p2.setTitulo("Avatar");
        p2.setGenero("Ciencia Ficción");
        p2.setDuracion(162);
        p2.setDescripcion("Un marine en un mundo alienígena");
        repo.save(p2);

        Pelicula p3 = new Pelicula();
        p3.setTitulo("El Padrino");
        p3.setGenero("Drama");
        p3.setDuracion(175);
        p3.setDescripcion("La historia de una familia mafiosa");
        repo.save(p3);
    }
}