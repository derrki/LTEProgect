/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class SimpleVerb implements Verb{

    private String verbValue;
    private String verbTranslation;
    private String [] verbAlternatuveTranslation;
    public SimpleVerb(){}

    public SimpleVerb(String value, String translation) {
        this.verbValue = value;
        this.verbTranslation = translation;
    }

    public SimpleVerb(String verbValue, String[] verbAlternatuveTranslation){
        this.verbValue = verbValue;
        this.verbAlternatuveTranslation = verbAlternatuveTranslation;
    }

    public void setVerbValue(String verbValue) {
        this.verbValue = verbValue;
    }

    public String[] getVerbAlternatuveTranslation() {
        return verbAlternatuveTranslation;
    }

    public void setVerbTranslation(String verbTranslation)  {
        this.verbTranslation = verbTranslation;
    }

    public String getVerbValue() {
        return verbValue;
    }

    public String getVerbTranslation() {
        return verbTranslation;
    }

    public String returnEndingVerbS(String verb) {
        return verb + "es";
    }
}
