/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Verb {

    private String verbValue;
    private String verbTranslation;

    public Verb(String value, String translation) {

        this.verbValue = value;
        this.verbTranslation = translation;
    }


    public String getValue() {
        return verbValue;
    }

    public String getTranslation() {
        return verbTranslation;
    }
}
