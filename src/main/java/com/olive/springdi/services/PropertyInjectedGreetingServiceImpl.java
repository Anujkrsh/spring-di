package com.olive.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreetings(){
        String s = "Hello!! Bro-- Property injected";
        return s;
    }

}
