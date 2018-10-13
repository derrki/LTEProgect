package model;

public class ModalVerb extends Verb {

    public ModalVerb(String valueEnglish, String valueUkrainian) {
        super(valueEnglish, valueUkrainian);
    }

    public String returnVerbInTheInfinitive(String verb) {
        return verb;
    }

    public static String returnVerbPlusS(String verb) {
        return verb;
    }
}
