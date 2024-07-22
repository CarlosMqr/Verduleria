package org.cmendoza.verduleria.models;

public class noPerecedero extends Producto{
    String proteinas;

    public noPerecedero(String nombre, double precio, String proteinas) {
        super(nombre, precio);
        this.proteinas = proteinas;
    }

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }
}
