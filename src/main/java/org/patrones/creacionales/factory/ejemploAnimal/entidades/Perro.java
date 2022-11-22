package org.patrones.creacionales.factory.ejemploAnimal.entidades;

import org.patrones.creacionales.factory.ejemploAnimal.Animal;

public class Perro implements Animal {

    @Override
    public void nacer() {
        System.out.println("El perro nació");
    }


}
