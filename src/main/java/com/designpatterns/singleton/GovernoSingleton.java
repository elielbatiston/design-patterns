package com.designpatterns.singleton;

public class GovernoSingleton {

    private static GovernoSingleton instance;

    private GovernoSingleton() {}

    public static GovernoSingleton getInstance() {
        if (instance == null) {
            instance = new GovernoSingleton();
        }
        return instance;
    }

    public void doAnything() {
        System.out.println("I did anything");
    }
}
