package model;

public class Pronoun extends Word {

    public Pronoun(String valueEnglish, String valueUkrainian) {
        super(valueEnglish, valueUkrainian);
    }

    public String getValueEnglish() {
        return retutnIWidthCapitalLeters(super.getValueEnglish());
    }

    public String retutnIWidthCapitalLeters(String value) {

        if (value == "i" || value == "I") {
            return "I";
        } else {
            return value;
        }
    }

    @Override
    public String toString() {
        String thePersonalPronoun = retutnIWidthCapitalLeters(getValueEnglish());
        return "Pronoun {" + thePersonalPronoun + " - " + getValueUkrainian() + "}";
    }
}
