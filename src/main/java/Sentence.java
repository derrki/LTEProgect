/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Sentence {

    private String word;

    private Pronoun pronoun;

    private Verb verb;

    public Sentence(){}

    public Sentence(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String returnSentens(){
        String sentens = word + "!";

        return sentens;
    }

    public String buildSentens(String pronoun, String verb) {
        return pronoun.toUpperCase() + " " + verb + ".";
    }

    public String sentenseToUpperCase(Pronoun pronoun, Verb verb) {
        return pronoun.getTranslation().toUpperCase() + " " + verb.getTranslation();
    }
}
