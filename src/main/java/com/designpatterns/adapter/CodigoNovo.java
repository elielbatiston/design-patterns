package com.designpatterns.adapter;

public class CodigoNovo {

    public void salvarNoBanco() {
        System.out.println("Codigo novo: Salvar");
    }

    public void gerarRelatorio(String nome) {
        System.out.println("Codigo novo: Relatorio " + nome + " gerado");
    }
}
