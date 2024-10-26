package com.example.exemplo_docker_api;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")

public class MeuController {
    @GetMapping("/hello")
    public String hello() {
            return "Olá, Mundo!";
    }
}
