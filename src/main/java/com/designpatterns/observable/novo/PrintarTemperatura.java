package com.designpatterns.observable.novo;

import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.Flow.Subscriber;

public class PrintarTemperatura implements Subscriber<Float> {

    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Float item) {
        System.out.println("Temperatura atual (novo): " + item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
