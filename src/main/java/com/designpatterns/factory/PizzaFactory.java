package com.designpatterns.factory;

public class PizzaFactory implements ComidaFactory {

    @Override
    public Comida criarComida(int id) {
        if (id == 0) {
            //Pizza mista
            Pizza p = new Pizza();

            p.nome = "Pizza mista";
            p.bordaComRecheio = false;
            p.sabor1 = "Queijo";
            p.sabor2 = "Presunto";
            p.comPalmito = false;

            return p;
        } else if (id == 1) {
            //Pizza portuguesa
            Pizza p = new Pizza();

            p.nome = "Pizza portuguesa";
            p.bordaComRecheio = true;
            p.sabor1 = "Ovo";
            p.sabor2 = "Presunto";
            p.comPalmito = true;

            return p;
        } else {
            //Pizza calabresa
            Pizza p = new Pizza();

            p.nome = "Pizza calabresa";
            p.bordaComRecheio = true;
            p.sabor1 = "Calabresa";
            p.sabor2 = "Queijo";
            p.comPalmito = false;

            return p;
        }
    }
}
