package com.designpatterns.observable.antigo;

import java.util.Observable;
import java.util.Observer;

public class PrintarTemperatura implements Observer {

    private Clima climaTemperatura;

    public PrintarTemperatura(Clima climaTemperatura) {
        this.climaTemperatura = climaTemperatura;
        this.climaTemperatura.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Temperatura atual: " + this.climaTemperatura.getTemperatura());
    }
}
