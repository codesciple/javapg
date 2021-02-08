package com.upgrad.SpringBootHelloWorld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//The annotation @RestController is used to tell Spring MVC
// to use the class HelloWorldController for handling web requests

@RestController
public class HelloWorldController {

    //@RequestMapping maps the uri "/hello" to the hello() method
    @RequestMapping("/hello")
    public String hello(){
        return "Hello and welcome to your first web project using Spring Boot";
    }
}
