package com.designpatterns.chain_of_responsability;

public abstract class Handler {

    private Handler successor;

    protected abstract void execute();

    public void handlerRequest() {
        this.execute();
        if (this.successor != null) {
            this.successor.handlerRequest();
        }
    }

    //opcional
    public void successor(Handler successor) {
        this.successor = successor;
    }

    public Handler next() {
        return this.successor;
    }
}
