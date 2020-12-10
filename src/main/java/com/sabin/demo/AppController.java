package com.sabin.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("test/model")
    public Model getModel(){
        Model model=new Model();
        model.setFirstname("Sa");
        model.setLastname("KC");
        return model;
    }
}
