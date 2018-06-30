package ClassesOfWords;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class ContentWords extends WordClass {

    private Value value;
    private UkrainianWord ukrainianWord;

    public ContentWords(Value value, UkrainianWord ukrainianWord) {
        this.value = value;
        this.ukrainianWord = ukrainianWord;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public UkrainianWord getUkrainianWord() {
        return ukrainianWord;
    }

    public void setUkrainianWord(UkrainianWord ukrainianWord) {
        this.ukrainianWord = ukrainianWord;
    }
}
