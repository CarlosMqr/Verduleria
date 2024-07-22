package org.cmendoza.verduleria;

import org.cmendoza.verduleria.models.*;

public class EjenploVerduleria {
    public static void main(String[] args) {

        Producto [] productos = new Producto[4];

        productos[0] = new Fruta("Sandia",50,"verde",250);
        productos[1] = new Lacteo("yacult",8,35,100);
        productos[2] = new Limpieza("Escoba",45, "Cloro",1);
        productos[3] = new noPerecedero("Cereal", 60,80);

    }
}
