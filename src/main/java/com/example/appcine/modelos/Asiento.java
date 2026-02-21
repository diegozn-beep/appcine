package com.example.appcine.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_asiento")
public class Asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nombre;
    private boolean ocupado;
    private int codigoPelicula;

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public boolean isOcupado() { return ocupado; }
    public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }

    public int getCodigoPelicula() { return codigoPelicula; }
    public void setCodigoPelicula(int codigoPelicula) { this.codigoPelicula = codigoPelicula; }
}