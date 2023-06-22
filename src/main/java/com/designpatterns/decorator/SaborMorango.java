package com.designpatterns.decorator;

public class SaborMorango extends SorveteDecorator {

    public SaborMorango(Sorvete objDecorado) {
        super(objDecorado);
    }

    @Override
    public float preco() {
        return this.objDecorado.preco() + 2f;
    }
}
