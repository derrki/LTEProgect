package ClassesOfWords;

import ClassesOfWords.ContentWords;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class VerbInfinitive extends ContentWords {

    public VerbInfinitive(Value value, Translation translation) {
        super(value, translation);
    }

    public String returnEndingVerbS(String verb) {
        return verb + "es";
    }

    public String returnVerbInTheInfinitive(String value) {
         String infinitive = "to " + value;
         return infinitive;
    }
}
