package com.enoxs.datadef;

import com.enoxs.injection.TextSEv0;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextSEv0Config {
    @Bean
    public TextSEv0 textSEv0(){
        return new TextSEv0( spellChecker() );
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}