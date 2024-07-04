package com.clase4.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Convertirlo en un rest controller.
@RequestMapping("/info")
public class infoControlador {
    @GetMapping//GET Method
    public String statusInfo(){
        return "Online";
    }
    @GetMapping("/server")//GET Method anidado en /info.
    public String GetInfoServer(){
        return "GET Online";
    }
    @PostMapping("/server")//POST Method anidado en /info.
    public String PostInfoServer(String name, String email){//Crear un parametro.
        System.out.println(name);
        System.out.println(email);
        return "POST: My name is "+name+" and my email is "+email;
    }
}
