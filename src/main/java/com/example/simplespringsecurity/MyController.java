package com.example.simplespringsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyController {
    /**
     * this page is secured by the spring security
     * @return
     */
    @GetMapping
    public String index() {
        return "index";
    }
}

