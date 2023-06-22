package com.designpatterns.decorator;

public abstract class SorveteDecorator implements Sorvete {

    protected Sorvete objDecorado;

    public SorveteDecorator(Sorvete objDecorado) {
        this.objDecorado = objDecorado;
    }
}
