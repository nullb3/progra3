package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semana5")

public class DemoController {
    @GetMapping("/info")
    public String Semana5Get(){
        Estructuras misEstructuras = new Estructuras();
        misEstructuras.createList();
        return misEstructuras.getInfoList().toString();
    }
    @PostMapping("/info")
    public String Semana5Post(String info){
        Estructuras misEstructuras = new Estructuras();
        misEstructuras.createList();
        return misEstructuras.addToList(info).toString();
    }
}
