import ClassesOfWords.ContentWords;

public class Translation extends ContentWords {
  String translationWord [];

    public Translation(String[] translationWord) {
        this.translationWord = translationWord;
    }

    public Translation(String value, String[] translationWord) {
        super(value);
        this.translationWord = translationWord;
    }

    public String[] getTranslationWord() {
        return translationWord;
    }

    public void setTranslationWord(String[] translationWord) {
        this.translationWord = translationWord;
    }
}
