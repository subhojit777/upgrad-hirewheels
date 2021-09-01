package com.upgrad.hirewheels;

import com.upgrad.hirewheels.services.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner{
    @Autowired
    @Qualifier(value = "initServiceImpl")
    private InitService initService;

    public void run(String... args) throws Exception {
        initService.start();
    }
}
