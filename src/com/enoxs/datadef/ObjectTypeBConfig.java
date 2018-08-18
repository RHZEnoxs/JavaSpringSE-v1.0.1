package com.enoxs.datadef;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ObjectTypeAConfig.class)
public class ObjectTypeBConfig {
    @Bean
    public ObjectTypeA objectTypeA(){
        return new ObjectTypeA();
    }
}
