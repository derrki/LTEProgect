package model;

public class Pronoun extends Word {

    public Pronoun(String valueEnglish, String valueUkrainian) {
        super(valueEnglish, valueUkrainian);
    }

    public String retutnIWidthCapitalLeters(String value) {

        if (value == "i" || value == "I") {
            return "I";
        } else {
            return value;
        }
    }
}
