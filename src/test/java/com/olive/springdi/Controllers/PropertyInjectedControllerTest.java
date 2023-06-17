package com.olive.springdi.Controllers;

import com.olive.springdi.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    @BeforeEach
    void Setup(){
        controller =new PropertyInjectedController();
        controller.greetingService=new ConstructorInjectedGreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}