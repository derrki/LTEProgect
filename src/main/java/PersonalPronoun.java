/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class PersonalPronoun implements Pronoun{

    private String pronounValue;
    private String pronounTranslation;

    public PersonalPronoun() {
    }

    public PersonalPronoun(String value, String translation){
        this.pronounValue = value;
        this.pronounTranslation = translation;
    }

    public String getPronounValue(){
        return pronounValue;
    }

    public String getPronounTranslation() {
        return pronounTranslation;
    }

    public String retutnIWidthCapitalLeters() {

        if (pronounValue == "i" || pronounValue == "I"){
            return "I";
        } else {
            return pronounValue;
        }
    }

    public void setPronounValue(String pronounValue) {
        this.pronounValue = pronounValue;
    }

    public void setPronounTranslation(String pronounTranslation){
        this.pronounValue = pronounTranslation;
    }
}
