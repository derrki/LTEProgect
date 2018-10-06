package newClasses;

public class Verbs {
   static final String [] verbsEngl = {"go", "work","want"};
   static final String [] verbsUa = {"йти", "працювати","хотіти"};

    public Verbs(){}
    public Verbs(String arg){

    }

   static   public String [] getVerb(){
        return verbsEngl;
    }

    static   public String [] getVerbsUa(){
        return verbsUa;
    }
}
