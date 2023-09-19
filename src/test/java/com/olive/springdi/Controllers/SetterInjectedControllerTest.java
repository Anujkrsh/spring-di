package com.olive.springdi.Controllers;

import com.olive.springdi.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller=new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}