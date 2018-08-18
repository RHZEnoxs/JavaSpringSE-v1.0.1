package com.enoxs.injection;

import com.enoxs.datadef.SpellChecker;

public class TextSEv0 {
    private SpellChecker spellChecker;

	public TextSEv0(SpellChecker spellChecker) {
		System.out.println("Inside TextSEv0 Constructor." );
		this.spellChecker = spellChecker;
	}

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
