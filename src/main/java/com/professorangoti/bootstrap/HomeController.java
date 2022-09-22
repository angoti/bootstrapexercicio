package com.professorangoti.bootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("exercicio-bootstrap")
    public String resolveExercicio(){
        return "home";
    }
    @GetMapping("file")
    public String navega(){
        return "outrapagina";
    }
}
