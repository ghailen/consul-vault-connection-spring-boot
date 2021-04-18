package com.ghailene.vaultconsulconnection.configuration.controllers;

import com.ghailene.vaultconsulconnection.configuration.ConsulConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {

    @Value("${my.email}")
    private String em;
    @Value("${my.username}")
    private String un;
    @Value("${my.password}")
    private String ps;

    @Autowired
    private ConsulConfig consulConfig;

    @GetMapping("/getConfigData")
    public ConsulConfig getConsulConfig() {
        getDataFromConsulViaAnnotation();
        return consulConfig;
    }

    private void getDataFromConsulViaAnnotation(){
        System.out.println("my email  = "+em);
        System.out.println("my userName  = "+un);
        System.out.println("my password  = "+ps);
    }

}
