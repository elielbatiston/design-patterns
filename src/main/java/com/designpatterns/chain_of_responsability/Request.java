package com.designpatterns.chain_of_responsability;

public class Request extends Handler {

    @Override
    protected void execute() {
        System.out.println("requisição");
    }
}
