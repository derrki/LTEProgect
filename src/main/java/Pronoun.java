public class Pronoun extends Word{

    public Pronoun(){
        super();
    }

    public Pronoun(String value, String translation){
        super(value, translation);
        System.out.println("pronoun");
    }

    public String retutnIWidthCapitalLeters() {

        if (super.getValue() == "i" || super.getValue() == "I"){
            return "I";
        } else {
            return super.getValue();
        }
    }
}
