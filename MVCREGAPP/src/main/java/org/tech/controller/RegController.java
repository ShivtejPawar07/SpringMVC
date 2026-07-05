package org.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}