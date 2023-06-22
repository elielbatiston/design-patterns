package com.designpatterns.observable.antigo;

public class MainObservable {

    public static void main(String[] args) {
        Clima c = new Clima(10f);
        PrintarTemperatura printar = new PrintarTemperatura(c);
        c.setTemperatura(20f);
        c.setTemperatura(30f);
        c.setTemperatura(40f);
        c.setTemperatura(45.6f);
    }
}
