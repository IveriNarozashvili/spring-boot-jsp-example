package com.github.IveriNarozashvili.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

@GetMapping({"/","/hello"})
    public  String index() {
        return "home";
    }
}
