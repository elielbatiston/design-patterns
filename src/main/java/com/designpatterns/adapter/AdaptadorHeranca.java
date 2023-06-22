package com.designpatterns.adapter;

public class AdaptadorHeranca extends CodigoAntigo implements Metodos {

    @Override
    public void metodo1() {
        salvarNoBanco();
    }

    @Override
    public void metodo2(String nome) {
        gerarRelatorio(nome);
    }
}
