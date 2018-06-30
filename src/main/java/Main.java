import ClassesOfWords.EnglishWord;
import ClassesOfWords.Pronoun;
import ClassesOfWords.UkrainianWord;
import ClassesOfWords.VocabularyPair;
import sun.java2d.pipe.ValidatePipe;

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
