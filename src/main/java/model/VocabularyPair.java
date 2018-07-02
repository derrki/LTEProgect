package model;

public class VocabularyPair {

    private WordClass wordClass;

    public VocabularyPair(WordClass wordClass) {
        this.wordClass = wordClass;
    }

    public WordClass getWordClass() {
        return wordClass;
    }

    public void setWordClass(WordClass wordClass) {
        this.wordClass = wordClass;
    }

    @Override
    public String toString() {
        return "VocabularyPair{" +
                "wordClass=" + wordClass.getValue() +
                '}';
    }
}
