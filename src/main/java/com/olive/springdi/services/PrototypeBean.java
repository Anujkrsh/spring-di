package com.olive.springdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean(){
        System.out.print("this is PrototypeBean  \n");
    }

    public String getMyScope(){
        return "PrototypeBean";
    }
}
