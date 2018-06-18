/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Sentence {

    private String word;

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
}
