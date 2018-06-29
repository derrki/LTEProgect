public class VerbInfinitive extends Word{

    private String translationInfinitive;

     public VerbInfinitive(String value, String translation){
         super(value, translation);
         translationInfinitive = translation;
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
