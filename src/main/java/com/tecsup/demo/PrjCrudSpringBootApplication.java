package com.tecsup.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class PrjCrudSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrjCrudSpringBootApplication.class, args);
    }

}
