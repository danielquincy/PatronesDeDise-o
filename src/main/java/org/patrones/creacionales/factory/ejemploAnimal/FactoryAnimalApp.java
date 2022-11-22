package org.patrones.creacionales.factory.ejemploAnimal;

public class FactoryAnimalApp {
static Creador creador;

    public static void main(String...ars){
        creador = new PezCreador();
        creador.nacer();
    }

}
