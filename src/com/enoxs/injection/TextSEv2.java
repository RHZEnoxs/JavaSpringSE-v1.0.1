package com.enoxs.injection;

import com.enoxs.datadef.SpellChecker;

public class TextSEv2 {
    private SpellChecker spellChecker;
    private String name;
    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
//        System.out.println("Inside TextSEv2 setSpellChecker." );
        this.spellChecker = spellChecker;
    }
    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
