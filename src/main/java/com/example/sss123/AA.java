package com.example.sss123;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AA {
    @RequestMapping("/aaa")
    public  String f(){

        return "hello word ";
    }
}
