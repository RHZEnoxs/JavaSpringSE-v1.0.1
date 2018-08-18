package com.enoxs.injection;

import com.enoxs.datadef.SpellChecker;

public class TextSEv2_2 {
    private SpellChecker spellChecker;
    private String name;

    public TextSEv2_2( SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
