package model;

public class Sentence {

    Pronoun pronoun;
    Verb verb;
    String resultSentens;

    public Sentence(Pronoun pronoun, Verb verb) {
        this.pronoun = pronoun;
        this.verb = verb;
    }

    public String buildSimpleSentens(Pronoun pronoun, Verb verb) {
        this.resultSentens = pronoun.getValueEnglish() + " " + verb.getValueEnglish();
        return resultSentens;
    }

    @Override
    public String toString() {
        return "Sentence{" +resultSentens +"}";
    }
}
