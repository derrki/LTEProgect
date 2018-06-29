public class VerbInfinitive extends Word{

    private String translationInfinitive;

     public VerbInfinitive(Value value, Translation translation){

     }

    public String getTranslationInfinitive() {
        return translationInfinitive;
    }

    public String returnEndingVerbS(String verb) {
        return verb + "es";
    }

    public String returnVerbInTheInfinitive(String value) {
         String infinitive = "to " + value;
         return infinitive;
    }
}
