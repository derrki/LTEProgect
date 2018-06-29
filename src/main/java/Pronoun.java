public class Pronoun extends Word{

    public Pronoun(String value, String translation){
        super(value, translation);
    }

    public String retutnIWidthCapitalLeters() {
        if (super.getValue() == "i" || super.getValue() == "I"){
            return "I";
        } else {
            return super.getValue();
        }
    }


}
