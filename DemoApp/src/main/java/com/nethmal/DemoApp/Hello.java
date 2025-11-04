package com.nethmal.DemoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping ("/")
    public String sayHello() {
        return "Hello Nethmal!";
    }


}
