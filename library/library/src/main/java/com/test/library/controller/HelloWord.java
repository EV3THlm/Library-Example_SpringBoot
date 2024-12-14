package com.test.library.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWord {

    @RequestMapping("/world")
    public String helloWord() {
        return "¡Hello World! :D";
    }
}
