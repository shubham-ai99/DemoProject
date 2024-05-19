package com.comapany.springbootapp1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/get")
    public String helloMethod(){
        return "Hello Everyone!!";
    }
}
