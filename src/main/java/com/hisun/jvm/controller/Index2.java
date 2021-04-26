package com.hisun.jvm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/index2")
public class Index2 {

    @RequestMapping("/index")
    public String index(){

        return "ok";
    }
}
