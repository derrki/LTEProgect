public class WordDictionary {

    Value value;
    Translation translation;

    public WordDictionary(Value valueWord, Translation translationWord) {
        this.value = valueWord;
        this.translation = translationWord;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Translation getTranslation() {
        return translation;
    }

    public void setTranslation(Translation translation) {
        this.translation = translation;
    }
}
