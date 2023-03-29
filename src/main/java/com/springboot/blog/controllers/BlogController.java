package com.springboot.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController<Mobel> {
    @GetMapping("/blog")
    public String blogMain() {
        return blogMain();
    }

    @GetMapping("/blog")
    public String blogMain(Mobel mobel){
        return "blog-main";
    }
    @GetMapping("/blog")
    public String blogMain(Mobel mobel){
        return "blog-main";
    }
}
