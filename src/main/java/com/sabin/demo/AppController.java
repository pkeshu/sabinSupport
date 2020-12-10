package com.sabin.demo;

import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@RestController
public class AppController {
    @GetMapping("test/model")
    public Model getModel(){
        Model model=new Model();
        model.setFirstname("Sa");
        model.setLastname("KC");
        return model;
    }

    @GetMapping("github/testing")
    public String githubDemo(){
        return "Demo Github";
    }

    @GetMapping("final/testing")
    public String finalDemo(){
        return "Final Github";
    }

    @RequestMapping(value = "/v3", method = RequestMethod.POST)
    public Model fetchModel()
    {
        Model model1 = new Model();
        model1.setLastname("kkkk");
        model1.setFirstname("llll");

        return model1;
    }

}
