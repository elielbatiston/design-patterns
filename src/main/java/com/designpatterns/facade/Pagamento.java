package com.designpatterns.facade;

public class Pagamento {

    public static void pagarPeloCartao(float total) {
        System.out.println("Pago pelo cartão " + total);
    }

    public static void pagarPeloBoleto(float total) {
        System.out.println("Pago pelo boleto " + total);
    }
}
