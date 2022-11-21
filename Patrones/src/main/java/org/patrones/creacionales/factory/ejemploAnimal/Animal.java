package org.patrones.creacionales.factory.ejemploAnimal;

import lombok.Getter;

@Getter
public class Animal {
    private Boolean camina;
    private Boolean respira;


    public Animal(Boolean camina, Boolean respira) {
        this.camina = camina;
        this.respira = respira;
    }

    public Boolean getCamina(){
        return this.camina;
    }
    public Boolean getRespira(){
        return this.respira;
    }
}
