package com.enoxs.injection;

import com.enoxs.datadef.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;

public class TextSEv3 {
    private SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
