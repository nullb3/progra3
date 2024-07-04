package com.demo.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //convertirlo en un rest controller.
@RequestMapping("/estudiante")
public class DemoController {
    @GetMapping("/status")
    public String status(){
        return "online";
    }
}
