package com.rom.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("greeting")
    public String greeting(Map<String,Object> model){
    model.put("message","Hello Jack La");
    return "greeting";
    }
//    @GetMapping("greeting")
//    public String greeting(Model model) {
//        model.addAttribute("message", "Hello Jack La");
//        return "greeting";
//    }
}
