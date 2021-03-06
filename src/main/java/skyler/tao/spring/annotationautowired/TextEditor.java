package skyler.tao.spring.annotationautowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chaoqiang on 16/6/13.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
