/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class SimpleVerb implements Verb{

    private String value;
    private String translation;
    private String [] verbAlternatuveTranslation;
    public SimpleVerb(){}

    public SimpleVerb(String value, String translation) {
        this.value = value;
        this.translation = translation;
    }

    public SimpleVerb(String verbValue, String[] verbAlternatuveTranslation){
        this.value = verbValue;
        this.verbAlternatuveTranslation = verbAlternatuveTranslation;
    }

    public void setValue(String verbValue) {
        this.value = verbValue;
    }

    public String[] getVerbAlternatuveTranslation() {
        return verbAlternatuveTranslation;
    }

    public void setTranslation(String translation)  {
        this.translation = translation;
    }

    public String getValue() {
        return value;
    }

    public String getTranslation() {
        return translation;
    }

    public String returnRealTranslite(Pronoun pronoun) {
        return null;
    }

    public String returnEndingVerbS(String verb) {
        return verb + "es";
    }
}
