package newClasses;

import java.util.HashMap;
import java.util.Map;

public class Verbs {
   static final String [] verbsEngl = {"want", "like","need", "do", "live", "work", "know", "get", "see", "hear", "CAN", "MAY", "MUST"};

   Map mapGo = new HashMap();

    public Map getMapGo() {
        return mapGo;
    }

    static final String [] verbsUa = {"хотіти", "подобатись", "потребувати", "робити",
            "жити", "працювати", "знати", "отримувати", "бачити", "чути", "МОГТИ", "МОЖЕ", "ПОВИНЕН"};

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
