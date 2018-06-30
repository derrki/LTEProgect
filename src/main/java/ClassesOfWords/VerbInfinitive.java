package ClassesOfWords;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class VerbInfinitive extends ContentWords {

    public VerbInfinitive(Value value, UkrainianWord ukrainianWord) {
        super(value, ukrainianWord);
    }

    public String returnEndingVerbS(String verb) {
        return verb + "es";
    }

    public String returnVerbInTheInfinitive(String value) {
         String infinitive = "to " + value;
         return infinitive;
    }
}
