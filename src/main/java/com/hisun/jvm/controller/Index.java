package com.hisun.jvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/index")
public class Index {

    @GetMapping("/index")
    public String index(){
        return "ok";
    }

}
