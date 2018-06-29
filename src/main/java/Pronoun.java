public class Pronoun extends WordDictionary{


    public Pronoun(Value valueWord, Translation translationWord) {
        super(valueWord, translationWord);
    }

    public String retutnIWidthCapitalLeters() {
        if (super.getValue().toString() == "i" || super.getValue().toString() == "I"){
            return "I";
        } else {
            return super.getValue().toString();
        }
    }

    
}
