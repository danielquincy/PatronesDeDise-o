package org.patrones.creacionales.factory.ejemploAnimal.entidades;

import org.patrones.creacionales.factory.ejemploAnimal.Animal;

public class Pajaro implements Animal {

    @Override
    public void nacer() {
        System.out.println("El pajaro rompió el huevo! ");
    }
}
