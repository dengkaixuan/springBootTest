package com.dkx.search.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("first")
    public String first(Model model) {
        model.addAttribute("hello", "world");
        return "first";
    }
}
