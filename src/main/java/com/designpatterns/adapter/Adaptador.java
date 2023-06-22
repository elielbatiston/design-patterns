package com.designpatterns.adapter;

public class Adaptador implements Metodos {

    private CodigoAntigo adaptado;

    public Adaptador(CodigoAntigo ca) {
        this.adaptado = ca;
    }

    @Override
    public void metodo1() {
        adaptado.salvarNoBanco();
    }

    @Override
    public void metodo2(String nome) {
        adaptado.gerarRelatorio(nome);
    }
}
