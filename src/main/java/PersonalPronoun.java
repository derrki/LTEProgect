/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class PersonalPronoun implements Pronoun{

    private String value;
    private String translation;

    enum personalPronoun {I, you, we, they, he, she, it }

    public PersonalPronoun() {
    }

    public PersonalPronoun(String value, String translation){
        this.value = value;
        this.translation = translation;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setTranslation(String translation){
        this.value = translation;
    }

    public String getValue(){
        return value;
    }

    public String getTranslation() {
        return translation;
    }

    public String retutnIWidthCapitalLeters() {

        if (value == "i" || value == "I"){
            return "I";
        } else {
            return value;
        }
    }
}
