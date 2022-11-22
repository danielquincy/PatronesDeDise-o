package org.patrones.creacionales.factory.ejemploAnimal;

import org.patrones.creacionales.factory.ejemploAnimal.Animal;
import org.patrones.creacionales.factory.ejemploAnimal.Creador;
import org.patrones.creacionales.factory.ejemploAnimal.entidades.Pez;

public class PezCreador extends Creador {

    @Override
    Animal crearAnimal() {
        return new Pez();
    }
}
