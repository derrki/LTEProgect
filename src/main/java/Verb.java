public class Verb extends Word{

     public Verb(String value, String translation){
         super(value, translation);
     }

    public String returnEndingVerbS(String verb) {
        return verb + "es";
    }
}
