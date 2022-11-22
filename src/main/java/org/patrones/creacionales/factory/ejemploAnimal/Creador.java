package org.patrones.creacionales.factory.ejemploAnimal;

public abstract class Creador {

    public void nacer() {
        Animal animal = crearAnimal();
        animal.nacer();
    }

    abstract Animal crearAnimal();
}
