package com.designpatterns.strategy;

public class DBPostgree implements DBStrategy {
    @Override
    public void conectar() {
        System.out.println("Contectado com postgree");
    }

    @Override
    public void salvar() {
        System.out.println("Dado salvo com postgree");
    }

    @Override
    public void ler() {
        System.out.println("Lido com postgree");
    }
}
