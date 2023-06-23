package com.designpatterns.chain_of_responsability;

public class After extends Handler {

    @Override
    protected void execute() {
        System.out.println("depois");
    }
}
