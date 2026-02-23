package com.example.appcine.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_boleta")
public class Boleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nombreComprador;
    private String dni;
    private String tipoAsiento;
    private int cantidad;
    private String metodoPago;
    private String tituloPelicula;
    private double precio;

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNombreComprador() { return nombreComprador; }
    public void setNombreComprador(String nombreComprador) { this.nombreComprador = nombreComprador; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getTipoAsiento() { return tipoAsiento; }
    public void setTipoAsiento(String tipoAsiento) { this.tipoAsiento = tipoAsiento; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public String getTituloPelicula() { return tituloPelicula; }
    public void setTituloPelicula(String tituloPelicula) { this.tituloPelicula = tituloPelicula; }
}