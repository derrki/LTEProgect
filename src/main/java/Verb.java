public class Verb extends Word{
     public Verb(){
         super();
     }


     public Verb(String value, String translation){
         super(value, translation);
         System.out.println("verb");
     }

    public String returnEndingVerbS(String verb) {
        return verb + "es";
    }
}
