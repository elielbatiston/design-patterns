package com.designpatterns.facade;

public class MainFacade {

    public static void main(String[] args) {
        CompraFacade.finalizarCompra(10, "Uma rua qualquer", "23123", "Correios", 1);
        CompraFacade.finalizarCompra(10, "Uma rua qualquer", "23123", "Correios", 0);
    }
}
