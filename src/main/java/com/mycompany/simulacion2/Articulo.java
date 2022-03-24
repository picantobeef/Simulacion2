package com.mycompany.simulacion2;

import java.io.Serializable;

public class Articulo implements Serializable {
    
    private String nomArticulo;
    private String cantidad;
    private String precio;

    public Articulo(String nomArticulo, String cantidad, String precio) {
        this.nomArticulo = nomArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Articulo() {
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNomArticulo() {
        return nomArticulo;
    }

    public void setNomArticulo(String nomArticulo) {
        this.nomArticulo = nomArticulo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nomArticulo=" + nomArticulo
                + ", cantidad=" + cantidad
                + ", precio=" + precio + '}';
    }

}
