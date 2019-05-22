package org.eventhub.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/level2")
public class Level2 {

    @GetMapping
    public String calender(){
        return "level2";
    }
}
