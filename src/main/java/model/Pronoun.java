package model;

public class Pronoun extends WordClass{

    private String value;
    private String translation;

    public Pronoun(EnglishWord englishWord ,UkrainianWord ukrainianWord){
        value = englishWord.getValue();
        translation = ukrainianWord.getValue();
    }

    @Override
    public String toString() {
        return "prn";
    }
//    public String retutnIWidthCapitalLeters() {
//        if (super.getEnglishWord().toString() == "i" || super.getEnglishWord().toString() == "I"){
//            return "I";
//        } else {
//            return super.getEnglishWord().toString();
//        }
//    }
}
