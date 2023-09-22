package com.olive.springdi.config;


import com.olive.springdi.repositories.EnglishGreetingRepository;
import com.olive.springdi.repositories.EnglishGreetingRepositoryImpl;
import com.olive.springdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService(){
        return new I18NSpanishService();
    }

    @Primary
    @Bean
    PrimaryGreetingServiceImpl primaryGreetingService(){
        return new PrimaryGreetingServiceImpl();
    }

    @Bean
    ConstructorInjectedGreetingServiceImpl constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingServiceImpl();
    }

    @Bean
    PropertyInjectedGreetingServiceImpl propertyInjectedGreetingServiceImpl(){
       return new PropertyInjectedGreetingServiceImpl() ;
    }

    @Bean
    SetterInjectedGreetingServiceImpl setterInjectedGreetingServiceImpl(){
        return new SetterInjectedGreetingServiceImpl();
    }
}
