package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/hello")
public class HelloController {

    @Get("/")
    public String index() {
        return "Hello, Micronaut!";
    }
}
