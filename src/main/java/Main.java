/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {

        Verb [] verb = {new Verb("know", "знати"), new Verb("work", "працювати"), new Verb("feel", "відчувати")};
        Pronoun pronoun = new Pronoun("I", "я");
        Sentence sentence = new Sentence();

        for (int i = 0; i < verb.length; i ++){
            System.out.println(sentence.buildSentens(pronoun.getValue(), verb[i].getValue()));
        }

    }
}
