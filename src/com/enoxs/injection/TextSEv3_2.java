package com.enoxs.injection;

import com.enoxs.datadef.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;

public class TextSEv3_2 {
    private SpellChecker spellChecker;

    @Autowired
    public TextSEv3_2 (SpellChecker spellChecker){
        System.out.println("Inside TextSEv3_2 constructor." );
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
