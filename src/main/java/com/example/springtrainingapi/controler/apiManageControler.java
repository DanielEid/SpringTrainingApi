package com.example.springtrainingapi.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiManageControler {

    @GetMapping("/")
    public String hello(){
        return "Hello to my Spring API";
    }

    @GetMapping("/*")
    public String badRequest(){
        return "Error 400: Bad Request";
    }

}
