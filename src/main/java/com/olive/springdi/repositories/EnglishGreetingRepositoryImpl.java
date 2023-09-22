package com.olive.springdi.repositories;


public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {


    @Override
    public String getGreeting() {
        return "Hello World - EN--from here";
    }
}
