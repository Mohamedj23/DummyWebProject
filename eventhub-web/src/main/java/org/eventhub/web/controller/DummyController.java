package org.eventhub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dummy")
public class DummyController {

    @GetMapping("/calender")
    public String calender(){
        return "Calendar";
    }

    //Mohamed


    //Amr




    //Aya





    //Menna




    //Eraky





}
