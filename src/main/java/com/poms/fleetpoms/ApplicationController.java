package com.poms.fleetpoms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
