package com.example.equipmentmonitoringsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test")
    @ResponseBody
    public String testPage(){
        return  "Test page passed";
    }
}
