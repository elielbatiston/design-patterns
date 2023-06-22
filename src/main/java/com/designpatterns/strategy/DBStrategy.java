package com.designpatterns.strategy;

public interface DBStrategy {
    void conectar();
    void salvar();
    void ler();
}
