/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Word {

    private String value;
    private String translation;

    public Word(String value, String translation){
        this.value = value;
        this.translation = translation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Word{" +
                "value='" + value + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }
}
