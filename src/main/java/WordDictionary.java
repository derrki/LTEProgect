import ClassesOfWords.EnglishWord;

public class WordDictionary {

    EnglishWord englishWord;
    Translation translation;

    public WordDictionary(EnglishWord englishWordWord, Translation translationWord) {
        this.englishWord = englishWordWord;
        this.translation = translationWord;
    }

    public EnglishWord getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(EnglishWord englishWord) {
        this.englishWord = englishWord;
    }

    public Translation getTranslation() {
        return translation;
    }

    public void setTranslation(Translation translation) {
        this.translation = translation;
    }
}
