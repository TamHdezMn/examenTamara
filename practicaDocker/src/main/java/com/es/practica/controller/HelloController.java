package com.es.practica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HelloController{
    
    @GetMapping("/hello")

    public String sayHello(){
        return "!Hola Mundo desde spring boot y Docker!";
    }

       // Método para manejar solicitudes POST en /crearHello
    @PostMapping("/crearHello")
    public String crearHello() {
        return "!Se ha creado un Hello!";
    }


    /// Método para manejar solicitudes PUT en /actualizarHello/{id}
    @PutMapping("/actualizarHello/{id}")
    public String actualizarHello(@PathVariable("id") Long id) {
        return "!Se ha actualizado el Hello con ID " + id + "actualizado correctamente";
    }

    //@PostMapping("/crearHello")
    //@PutMapping ("/actualizarHello/{id}")
    
}