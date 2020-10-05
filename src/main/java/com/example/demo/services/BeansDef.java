package com.example.demo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BeansDef {

    @Bean
    @Qualifier("restTemplateBean")
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    @Qualifier("str")
    public String str1(){
        return "string test value";
    }

    @Bean
    public String str2(){
        return "string";
    }
}
