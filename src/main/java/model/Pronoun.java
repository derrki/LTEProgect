package model;

public class Pronoun extends WordClass{

    private String value;
    private String translation;

    public Pronoun(EnglishWord englishWord ,UkrainianWord ukrainianWord){
        super(englishWord.getValue());
        value = englishWord.getValue();
        translation = ukrainianWord.getValue();
    }

    @Override
    public String toString() {
        return "prn";
    }
    public String returnIWidthCapitalLeters() {
        if (super.getValue() == "i" || super.getValue() == "I"){
            return "I";
        } else {
            return super.getValue();
        }
    }
}
