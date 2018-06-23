/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Pronoun {

    private String pronounValue;
    private String pronounTranslation;

    public Pronoun(String value, String translation){
        this.pronounValue = value;
        this.pronounTranslation = translation;
    }

    public Pronoun() {

    }

    public String getValue(){
        return pronounValue;
    }

    public String getTranslation() {
        return pronounTranslation;
    }

    public String retutnIWidthCapitalLeters() {

        if (pronounValue == "i" || pronounValue == "I"){
            return "I";
        } else {
            return pronounValue;
        }
    }

    public void setPronounValue(String value) {
        this.pronounValue = value;
    }

    public void setPronounTranslation(String translation){
        this.pronounValue = translation;
    }
}
