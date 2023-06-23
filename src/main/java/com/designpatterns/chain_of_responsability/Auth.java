package com.designpatterns.chain_of_responsability;

public class Auth extends Handler {

    @Override
    protected void execute() {
        System.out.println("autenticação");
    }
}
