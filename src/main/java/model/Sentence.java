package model;

public class Sentence {


    Pronoun pronoun;
    Verb verb;



    public Sentence(Pronoun pronoun, Verb verb) {
        this.pronoun = pronoun;
        this.verb = verb;
    }

    public String buildSimpleSentens(String valueEnglishPronoun, String valueEnglishVerb) {
        return valueEnglishPronoun + " " + valueEnglishVerb;
    }
}
