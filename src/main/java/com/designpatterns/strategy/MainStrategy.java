package com.designpatterns.strategy;

public class MainStrategy {

    public static void main(String[] args) {
        DBStrategy DB = new DBMySQL();
        DB.conectar();
        DB.salvar();
        DB.ler();

        DBStrategy DB1 = new DBPostgree();
        DB1.conectar();
        DB1.salvar();
        DB1.ler();
    }
}
