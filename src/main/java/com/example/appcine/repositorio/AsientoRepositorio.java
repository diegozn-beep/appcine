package com.example.appcine.repositorio;

import com.example.appcine.modelos.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AsientoRepositorio extends JpaRepository<Asiento, Integer> {
    List<Asiento> findByCodigoPelicula(int codigoPelicula);
}