package ClassesOfWords;

public class VocabularyPair {

    private WordClass wordClass;
    private EnglishWord englishWord;
    private UkrainianWord ukrainianWord;

    public VocabularyPair(WordClass wordClass, EnglishWord englishWord, UkrainianWord ukrainianWord) {
        this.wordClass = wordClass;
        this.englishWord = englishWord;
        this.ukrainianWord = ukrainianWord;
    }

    public WordClass getWordClass() {
        return wordClass;
    }

    public void setWordClass(WordClass wordClass) {
        this.wordClass = wordClass;
    }

    public EnglishWord getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(EnglishWord englishWord) {
        this.englishWord = englishWord;
    }

    public UkrainianWord getUkrainianWord() {
        return ukrainianWord;
    }

    public void setUkrainianWord(UkrainianWord ukrainianWord) {
        this.ukrainianWord = ukrainianWord;
    }

    @Override
    public String toString() {
        return  wordClass.getClass() +
                " value  - " + englishWord +
                " translation - " + ukrainianWord;
    }
}
