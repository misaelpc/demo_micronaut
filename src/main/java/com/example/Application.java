package com.example;

import io.micronaut.runtime.Micronaut;

public class Application { private Application() {}

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}