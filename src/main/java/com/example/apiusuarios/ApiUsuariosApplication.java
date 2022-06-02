package com.example.apiusuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiUsuariosApplication.class, args);
    }

}
