package com.designpatterns.decorator;

public class MainDecorator {

    public static void main(String[] args) {
        Sorvete s = new SorveteImpl();
        System.out.println(s.preco());

        Sorvete morango = new SaborMorango(s);
        System.out.println(morango.preco());

        Sorvete granulado = new Granulado(morango);
        System.out.println(granulado.preco());

        System.out.println("================================");

        Sorvete sorvete = new SorveteImpl();
        sorvete = new SaborMorango(sorvete);
        sorvete = new Granulado(sorvete);

        System.out.println(sorvete.preco());

        System.out.println("================================");

        Sorvete sorvete1 = new SaborMorango(new Granulado(new SorveteImpl()));
        System.out.println(sorvete1.preco());
    }
}
