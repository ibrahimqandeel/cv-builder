package com.prep.cvbuilder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/app-name")
public class AppController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping
    public String getAppName(){
        return "App name -> " + applicationName + ". This app is deployed on EKS.";
    }
}
