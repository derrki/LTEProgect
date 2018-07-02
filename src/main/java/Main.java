import model.EnglishWord;
import model.Pronoun;
import model.UkrainianWord;
import model.VocabularyPair;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {


        EnglishWord englishWord = new EnglishWord("I");
        UkrainianWord ukrainianWord = new UkrainianWord("я");
        Pronoun pronoun = new Pronoun(englishWord, ukrainianWord);

        VocabularyPair vocabularyPair = new VocabularyPair(pronoun);

        System.out.println(vocabularyPair);

    }
}
