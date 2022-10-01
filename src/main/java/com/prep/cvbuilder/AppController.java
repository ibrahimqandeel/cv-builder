package com.prep.cvbuilder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/health")
public class AppController {

    @GetMapping
    public String checkApp(){
        return "Hello App";
    }
}
