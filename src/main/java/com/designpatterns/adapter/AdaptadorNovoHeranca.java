package com.designpatterns.adapter;

public class AdaptadorNovoHeranca extends CodigoNovo implements Metodos {

    @Override
    public void metodo1() {
        salvarNoBanco();
    }

    @Override
    public void metodo2(String nome) {
        gerarRelatorio(nome);
    }
}
