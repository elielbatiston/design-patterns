package com.designpatterns.adapter;

public class CodigoAntigo {

    public void salvarNoBanco() {
        System.out.println("Codigo antigo: Salvar");
    }

    public void gerarRelatorio(String nome) {
        System.out.println("Codigo antigo: Relatorio " + nome + " gerado");
    }
}
