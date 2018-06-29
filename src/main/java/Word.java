/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Word {

    private String value;

    public Word(){}

    public Word(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "value = " + value;
    }
}
