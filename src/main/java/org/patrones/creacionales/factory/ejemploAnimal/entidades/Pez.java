package org.patrones.creacionales.factory.ejemploAnimal.entidades;

import org.patrones.creacionales.factory.ejemploAnimal.Animal;

public class Pez implements Animal {
    @Override
    public void nacer() {
        System.out.println("El paz nadó fuerda del huevecillo");
    }
}
