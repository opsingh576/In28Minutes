package com.in28minutes.rest.services.restful_web_services.helloworld;


import org.springframework.http.MediaType;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld()
    {

        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean()
    {

        return new HelloWorldBean("hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name)
    {

        return new HelloWorldBean(String.format("Hello World,%s",name));
    }




}
