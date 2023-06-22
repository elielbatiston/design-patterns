package com.designpatterns.strategy;

public class DBMySQL implements DBStrategy {
    @Override
    public void conectar() {
        System.out.println("Contectado com mysql");
    }

    @Override
    public void salvar() {
        System.out.println("Dado salvo com mysql");
    }

    @Override
    public void ler() {
        System.out.println("Lido com mysql");
    }
}
