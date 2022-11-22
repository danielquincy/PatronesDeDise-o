package org.patrones.creacionales.factory.ejemploAnimal;

import org.patrones.creacionales.factory.ejemploAnimal.entidades.Pajaro;

public class PajaroCreador extends Creador {

    @Override
    Animal crearAnimal() {
        return new Pajaro();
    }
}

