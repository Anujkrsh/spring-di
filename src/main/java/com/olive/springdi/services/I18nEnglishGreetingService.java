package com.olive.springdi.services;

import com.olive.springdi.repositories.EnglishGreetingRepository;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreetings() {
        return "Hello World - EN";
    }
}
