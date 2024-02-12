package com.example.deploymenttest.Controller;
import com.example.deploymenttest.Service.ServiceTesting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTesting {
    private final ServiceTesting serviceTesting;

    public ControllerTesting(ServiceTesting serviceTesting) {
        this.serviceTesting = serviceTesting;
    }

    @GetMapping("/")
    public String helloworld(){

        return ServiceTesting.helloMethod();
    }
}
