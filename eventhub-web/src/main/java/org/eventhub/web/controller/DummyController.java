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

    @GetMapping("/inbox")
    public String inbox(){return "inbox";}

    @GetMapping("/index")
    public String index(){return "index";}

    @GetMapping("/index2")
    public String index2(){return "index2";}

    @GetMapping("/index3")
    public String index3(){return "index3";}

    @GetMapping("/invoice")
    public String invoice(){return "invoice";}

    @GetMapping("/level2")
    public String level2(){
        return "level2";
    }

    @GetMapping("/login")
    public String login(){return "login";}

}
