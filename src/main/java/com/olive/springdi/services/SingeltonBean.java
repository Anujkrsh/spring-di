package com.olive.springdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class SingeltonBean {

    public SingeltonBean(){
        System.out.print("This is SingletonBean \n");
    }

    public String getMyScope(){
        return "SingeltonBean";
    }
}
