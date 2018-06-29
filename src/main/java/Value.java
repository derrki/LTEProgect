import ClassesOfWords.ContentWords;

public class Value extends ContentWords {
    String valueWord [];



    public Value(String[] valueWord) {
        this.valueWord = valueWord;
    }

    public Value(String value, String[] valueWord) {
        super(value);
        this.valueWord = valueWord;
    }

    public String[] getValueWord() {
        return valueWord;
    }

    public void setValueWord(String[] valueWord) {
        this.valueWord = valueWord;
    }
}
