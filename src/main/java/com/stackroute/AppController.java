package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String display(Model model){
        User user = new User("Febin",22);
        model.addAttribute("user",user);
        System.out.println(user.getName());
        return "index";
    }
}
