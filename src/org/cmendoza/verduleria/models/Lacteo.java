package org.cmendoza.verduleria.models;

public class Lacteo extends Producto{

    double proteinas;
    double cantidad;

    public Lacteo(String nombre, double precio, double proteinas, double cantidad) {
        super(nombre, precio);
        this.proteinas = proteinas;
        this.cantidad = cantidad;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
