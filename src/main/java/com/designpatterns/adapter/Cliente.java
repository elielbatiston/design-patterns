package com.designpatterns.adapter;

public class Cliente {
    Metodos obj = new Adaptador(new CodigoAntigo());
    Metodos objHeranca = new AdaptadorHeranca();

    Metodos objNovoHeranca = new AdaptadorNovoHeranca();

    public void executarPadrao() {
        obj.metodo1();
        obj.metodo2("Eliel");

        System.out.println("Adptador com herança =========");
        objHeranca.metodo1();
        objHeranca.metodo2("Eliel");

        System.out.println("Adptador novo com herança =========");
        objNovoHeranca.metodo1();
        objNovoHeranca.metodo2("Eliel");
    }
}
