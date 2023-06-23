package com.designpatterns.chain_of_responsability;

public class Before extends Handler {

    @Override
    protected void execute() {
        System.out.println("antes");
    }
}
