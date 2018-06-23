/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Verb {

    private String verbValue;
    private String verbTranslation;

    public  Verb(){}

    public Verb(String value, String translation) {
        this.verbValue = value;
        this.verbTranslation = translation;
    }

    public void setVerbValue(String verbValue) {
        this.verbValue = verbValue;
    }

    public void setVerbTranslation(String verbTranslation) {
        this.verbTranslation = verbTranslation;
    }

    public String getVerbValue() {
        return verbValue;
    }

    public String getVerbTranslation() {
        return verbTranslation;
    }

}
