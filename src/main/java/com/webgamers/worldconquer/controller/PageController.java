package com.webgamers.worldconquer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @GetMapping()
    public String index() {
        return "index";
    }

    @GetMapping("main")
    public String main() {
        return "main";
    }

    @RequestMapping(value = "/register.html")
    public String register() {
        return "register";
    }
}
