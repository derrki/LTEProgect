public class VerbInfinitive extends Word{

     public VerbInfinitive(String value, String translation){
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
