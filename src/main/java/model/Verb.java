package model;

public class Verb extends Word {

    public Verb(String valueEnglish, String valueUkrainian) {
        super(valueEnglish, valueUkrainian);
    }

    public String returnVerbInTheInfinitive(String verb) {
        String infinitiveVerb = String.valueOf(new StringBuilder("to ").append(verb));
        return infinitiveVerb;
    }

    @Override
    public String toString() {
        return "v";
    }
}
