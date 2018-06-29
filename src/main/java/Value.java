public class Value extends Word{
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
