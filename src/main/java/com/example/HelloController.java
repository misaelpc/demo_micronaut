package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
@Controller("/hello")
public class HelloController {

    @Get("/")
    public String index() {
        String firstName = "Misael";
        String lastName = new String("Misael"); // forces a new object

        // ❌ Non-compliant: comparing objects with '=='
        if (firstName == lastName) {
            return "Names are equal";
        } else {
            return "Names are NOT equal";
        }
    }
}
