package com.enoxs.injection;

import com.enoxs.datadef.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class TextSEv3_3 {
    private SpellChecker spellChecker;

    @Resource(name = "spellChecker")
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
