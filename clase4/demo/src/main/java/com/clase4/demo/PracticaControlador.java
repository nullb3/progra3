package com.clase4.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PracticaControlador{
    @GetMapping("/saludar")
    public String Saludar(){
        return "Hola!";
    }
    @GetMapping("/greet")
    public String Greet(){
        return "Hello!";
    }
    @PostMapping("/administrar")
    public String PostName(String name){
        return "La persona POST dice que su nombre es "+name;
    }
    @GetMapping("/administrar")
    public String GetName(String name){
        return "La persona GET dice que su nombre es "+name;
    }
}