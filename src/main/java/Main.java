/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {

        Sentence sentence = new Sentence();

        Value value = new Value("They", null);
        Translation translation  = new Translation("вони", null);

        Pronoun pronoun = new Pronoun(value, translation);
        System.out.println(pronoun.getValue() + " " + pronoun.getTranslation());

    }
}
