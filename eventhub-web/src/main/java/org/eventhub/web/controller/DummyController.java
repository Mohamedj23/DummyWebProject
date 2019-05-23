package org.eventhub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dummy")
public class DummyController {


    @GetMapping("/calendar")
    public String calender(){
        return "Calendar";
    }

    //Mohamed
    
    
    //Amr


    @GetMapping("/form_buttons")
    public String form_buttons(){

        return "form_buttons";
    }

    @GetMapping("/form_upload")
    public String form_upload(){

        return "form_upload";
    }

    @GetMapping("/form_validation")
    public String form_validation(){

        return "form_validation";
    }

    @GetMapping("/form_wizards")
    public String form_wizards(){

        return "form_wizards";
    }

    @GetMapping("/form_advanced")
    public String form_advanced(){

        return "form_advanced";
    }

    @GetMapping("/general_elements")
    public String general_elements(){

        return "general_elements";
    }

    @GetMapping("/glyphicons")
    public String glyphicons(){

        return "glyphicons";
    }

    @GetMapping("/icons")
    public String icons(){

        return "icons";
    }




    //Aya
    
    @GetMapping("/chartjs")
    public String chartjs() {
        return "chartjs";
    }

    @GetMapping("/chartjs2")
    public String chartjs2() {
        return "chartjs2";
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "contacts";
    }
    @GetMapping("/e_commerce")
    public String e_commerce() {
        return "e_commerce";
    }
    @GetMapping("/echarts")
    public String echarts() {
        return "echarts";
    }
    
    
    //Menna

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }

    @GetMapping("/projectdetail")
    public String projectDetail(){
        return "projectDetail";
    }

    @GetMapping("/projects")
    public String projects(){
        return "projects";
    }
    @GetMapping("/tables")
    public String tables(){
        return "tables";
    }
    @GetMapping("/tablesDynamic")
    public String tablesDynamic(){
        return "tablesDynamic";
    }
    @GetMapping("/typography")
    public String typography(){
        return "typography";
    }
    @GetMapping("/widgets")
    public String widgets(){
        return "widgets";
    }




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
