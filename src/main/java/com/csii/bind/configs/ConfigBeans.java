package com.csii.bind.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeans {
     @Bean
     //@LoadBalanced
     public RestTemplate getRestTemplate(){
         return new RestTemplate();
     }
     
//     @Bean
//     public IRule getIrule(){
//    	 return  new RandomRule();//随机
//     }
}
