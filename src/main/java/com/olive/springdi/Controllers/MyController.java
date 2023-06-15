package com.olive.springdi.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){

         System.out.println("Hello Folks");
        return "Hii";
    }
}
