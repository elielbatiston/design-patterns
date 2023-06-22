package com.designpatterns.observable.antigo;

import java.util.Observable;

public class Clima extends Observable {

    private float temperatura;

    public Clima(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        setChanged();
        notifyObservers();
    }
}
