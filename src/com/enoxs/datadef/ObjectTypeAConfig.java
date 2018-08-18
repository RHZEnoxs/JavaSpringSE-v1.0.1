package com.enoxs.datadef;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ObjectTypeAConfig {
//    @Bean
//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    @Scope("prototype")
    public ObjectTypeA objectTypeA(){
        return new ObjectTypeA();
    }
}
