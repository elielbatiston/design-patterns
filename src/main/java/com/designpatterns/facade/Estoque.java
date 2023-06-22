package com.designpatterns.facade;

public class Estoque {

    public static float retornarPrecoDeUmProdutoPeloID(int id) {
        if (id == 10) {
            return 1000f;
        }
        return 0f;
    }
}
