package ClassesOfWords;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class EnglishWord extends Word {

    public EnglishWord(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return super.getValue();
    }
}
