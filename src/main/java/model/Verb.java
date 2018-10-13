package model;

public class Verb extends Word {

    public Verb(String valueEnglish, String valueUkrainian) {
        super(valueEnglish, valueUkrainian);
    }

    public String returnVerbInTheInfinitive(String verb) {
        String infinitiveVerb = String.valueOf(new StringBuilder("to ").append(verb));
        return infinitiveVerb;
    }

    public static String returnVerbPlusS(String verb) {
        String verbPlusS = String.valueOf(new StringBuilder(verb).append('s'));
        return verbPlusS;
    }

    @Override
    public String toString() {
        String theInfinitive = returnVerbInTheInfinitive(getValueEnglish());
        return "Verb {" + theInfinitive + " - " + getValueUkrainian() + "}";
    }
}
