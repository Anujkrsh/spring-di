package com.olive.springdi.Controllers;

import com.olive.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    public GreetingService greetingService;

    public ConstructorInjectedController(/*@Qualifier("constructorInjectedGreetingServiceImpl") */GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
