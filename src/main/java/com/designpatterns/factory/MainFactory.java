package com.designpatterns.factory;

public class MainFactory {

    public static void main(String[] args) {
        PizzaFactory pf = new PizzaFactory();
        System.out.println(pf.criarComida(1).nome);
        System.out.println(pf.criarComida(0).nome);
        System.out.println(pf.criarComida(2).nome);
    }
}
