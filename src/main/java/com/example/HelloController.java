package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/hello")
public class HelloController {

    @Get("/")
    public String index() {
        return "Hello, Micronaut!";
    }
}
