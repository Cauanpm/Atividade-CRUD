package com.atividade.cauan.config;

import com.atividade.cauan.services.DBservice;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
    @Autowired
    private DBservice dBservice;

    @PostConstruct
    public void instanciaDB(){
        this.dBservice.instanciaDB();
    }
}
