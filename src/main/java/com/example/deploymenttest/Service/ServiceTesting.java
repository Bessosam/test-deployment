package com.example.deploymenttest.Service;

import org.springframework.stereotype.Service;

@Service
public class ServiceTesting {


    public static String helloMethod() {
        return String.format("<h1>Hello Bassam</h1>");

    }
}
