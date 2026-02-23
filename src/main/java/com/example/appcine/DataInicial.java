package com.example.appcine;

import com.example.appcine.modelos.Asiento;
import com.example.appcine.modelos.Pelicula;
import com.example.appcine.repositorio.AsientoRepositorio;
import com.example.appcine.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInicial implements CommandLineRunner {

    @Autowired
    PeliculaRepositorio repo;

    @Autowired
    AsientoRepositorio asientoRepo;

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

        // Agrega estas después de p3
        Pelicula p4 = new Pelicula();
        p4.setTitulo("2012");
        p4.setGenero("Suspenso");
        p4.setDuracion(158);
        p4.setDescripcion("El fin del mundo según el calendario maya");
        repo.save(p4);

        Pelicula p5 = new Pelicula();
        p5.setTitulo("El Joker");
        p5.setGenero("Drama");
        p5.setDuracion(122);
        p5.setDescripcion("Arthur Fleck se convierte en un brillante criminal");
        repo.save(p5);

        Pelicula p6 = new Pelicula();
        p6.setTitulo("Titanic");
        p6.setGenero("Drama");
        p6.setDuracion(214);
        p6.setDescripcion("Jack y Rose se enamoran en el transatlántico más famoso");
        repo.save(p6);

        Pelicula p7 = new Pelicula();
        p7.setTitulo("Siempre a tu lado - Hachiko");
        p7.setGenero("Drama");
        p7.setDuracion(93);
        p7.setDescripcion("Un perro fiel espera cada tarde a su amo en la estación");
        repo.save(p7);

        Pelicula p8 = new Pelicula();
        p8.setTitulo("Interestelar");
        p8.setGenero("Drama");
        p8.setDuracion(160);
        p8.setDescripcion("Un grupo explora el espacio para salvar a la humanidad");
        repo.save(p8);


        String[] nombres = {"A1","A2","A3","A4","A5","B1","B2","B3","B4","B5",
                "C1","C2","C3","C4","C5","D1","D2","D3","D4","D5"};
        for (int cod = 1; cod <= 8; cod++) {
            for (String nombre : nombres) {
                Asiento a = new Asiento();
                a.setNombre(nombre);
                a.setOcupado(false);
                a.setCodigoPelicula(cod);
                asientoRepo.save(a);
            }
        }
    }
}