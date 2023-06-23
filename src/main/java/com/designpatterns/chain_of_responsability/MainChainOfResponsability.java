package com.designpatterns.chain_of_responsability;

public class MainChainOfResponsability {

    public static void main(String[] args) {
        Handler before = new Before();
        Handler request = new Request();
        Handler after = new After();
        Handler auth = new Auth();

        auth.successor(before);
        before.successor(request);
        request.successor(after);

        auth.handlerRequest();
    }
}
