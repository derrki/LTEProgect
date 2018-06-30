import ClassesOfWords.EnglishWord;
import ClassesOfWords.Pronoun;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {

        Sentence sentence = new Sentence();

        EnglishWord englishWord = new EnglishWord("They", null);
        Translation translation  = new Translation("вони", null);

        Pronoun pronoun = new Pronoun(englishWord, translation);
        System.out.println(pronoun.getEnglishWord() + " " + pronoun.getTranslation());

    }
}
