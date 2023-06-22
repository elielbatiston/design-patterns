package com.designpatterns.observable.novo;

import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.SubmissionPublisher;

public class Clima implements Publisher<Float> {

    private float temperatura;
    private SubmissionPublisher<Float> publisher;

    public Clima(float temperatura) {
        this.temperatura = temperatura;
        this.publisher = new SubmissionPublisher<>();
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        publisher.submit(temperatura);
    }

    @Override
    public void subscribe(Subscriber<? super Float> subscriber) {
        publisher.subscribe(subscriber);
    }
}
