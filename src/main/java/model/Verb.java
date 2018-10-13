package model;

public class Verb extends WordClass {

    public Verb (){}


    public String returnVerbInTheInfinitive(String verb) {
        String infinitiveVerb = String.valueOf(new StringBuilder("to ").append(verb));
        return infinitiveVerb;
    }

    @Override
    public String toString() {
        return "v";
    }
}
