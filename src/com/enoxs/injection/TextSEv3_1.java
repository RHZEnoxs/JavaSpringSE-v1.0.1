package com.enoxs.injection;

import com.enoxs.datadef.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;

public class TextSEv3_1 {
    @Autowired
    private SpellChecker spellChecker;

    public TextSEv3_1() {
        System.out.println("Inside TextSEv3_1 Constructor." );
    }

    public SpellChecker getSpellChecker( ){
        return spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
