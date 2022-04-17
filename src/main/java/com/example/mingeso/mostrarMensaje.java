package com.example.mingeso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mostrarMensaje {
    @GetMapping("/mensaje")
        public String mensaje(){
        return("Aplicación web muy simple");
        }

    @GetMapping("/nuevoMensaje")
        public String nuevo(){
        return("Esta es otra ventana hecha en otro branch");
    }
}
