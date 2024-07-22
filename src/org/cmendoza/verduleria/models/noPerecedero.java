package org.cmendoza.verduleria.models;

public class noPerecedero extends Producto{
    int proteinas;

    public noPerecedero(String nombre, double precio, int proteinas) {
        super(nombre, precio);
        this.proteinas = proteinas;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
