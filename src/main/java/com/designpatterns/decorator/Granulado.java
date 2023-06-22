package com.designpatterns.decorator;

public class Granulado extends SorveteDecorator {

    public Granulado(Sorvete objDecorado) {
        super(objDecorado);
    }

    @Override
    public float preco() {
        return this.objDecorado.preco() + 2.5f;
    }
}
