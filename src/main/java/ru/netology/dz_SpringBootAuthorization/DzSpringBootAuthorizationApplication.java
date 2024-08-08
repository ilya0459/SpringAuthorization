package ru.netology.dz_SpringBootAuthorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.dz_SpringBootAuthorization.controller.AuthorizationController;
import ru.netology.dz_SpringBootAuthorization.repository.UserRepository;
import ru.netology.dz_SpringBootAuthorization.service.AuthorizationService;

@SpringBootApplication
public class DzSpringBootAuthorizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DzSpringBootAuthorizationApplication.class, args);
    }
}
