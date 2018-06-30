import ClassesOfWords.EnglishWord;
import ClassesOfWords.VerbInfinitive;

public class VerbAll extends VerbInfinitive {

    String [] allTranslite;

    public VerbAll(EnglishWord englishWord, Translation translation, String[] allTranslite) {
        super(englishWord, translation);
        this.allTranslite = allTranslite;
    }

}
