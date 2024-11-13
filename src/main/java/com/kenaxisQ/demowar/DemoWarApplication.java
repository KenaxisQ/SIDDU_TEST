package com.kenaxisQ.demowar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoWarApplication {

    @GetMapping("/demo")
    public String demo() {
        return "Application Deployment Successful, Super raa RAJESH";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoWarApplication.class, args);
    }

}
