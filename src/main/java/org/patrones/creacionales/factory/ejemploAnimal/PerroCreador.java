package org.patrones.creacionales.factory.ejemploAnimal;

import org.patrones.creacionales.factory.ejemploAnimal.Animal;
import org.patrones.creacionales.factory.ejemploAnimal.Creador;
import org.patrones.creacionales.factory.ejemploAnimal.entidades.Perro;
public class PerroCreador extends Creador {

    @Override
    Animal crearAnimal() {
        return new Perro();
    }
}
