import model.Verb;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Sentence {

    public Sentence(){}

   public String sentenseToUpperCase(model.Pronoun pronoun, Verb verb) {
        return pronoun.getValue() + " " + verb.getValue();
   }
}
