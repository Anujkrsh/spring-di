package com.olive.springdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings(){
        return "Hello!! Bro--Setter injected";
    }
}
