package com.olive.springdi.services;

import org.springframework.stereotype.Service;

//@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings(){
        return "Hello!! Bro ---Constructer Injected";
    }
}
