package org.eventhub.web.controller;

import org.eventhub.common.model.entity.Event;
import org.eventhub.common.model.entity.SystemUser;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.ws.rs.FormParam;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/dummy")
public class FormController {

    @InitBinder("user")
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }

    @PostMapping("/form")
    public String insertUser(@ModelAttribute("user") SystemUser user,BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        return "success";
    }

    @GetMapping("/form")
    public String signup(Model model)
    {
        SystemUser systemUser=new SystemUser();
        systemUser.setFirstName("AHmed");
        model.addAttribute("user",systemUser);
        return "form";
    }


}
