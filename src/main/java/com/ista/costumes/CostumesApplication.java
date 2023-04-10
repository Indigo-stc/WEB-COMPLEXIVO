package com.ista.costumes;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class CostumesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostumesApplication.class, args);
    }

}
