package ClassesOfWords;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class ContentWords extends WordClass {

    private Value value;
    private Translation translation;

    public ContentWords(Value value, Translation translation) {
        this.value = value;
        this.translation = translation;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Translation getTranslation() {
        return translation;
    }

    public void setTranslation(Translation translation) {
        this.translation = translation;
    }
}
