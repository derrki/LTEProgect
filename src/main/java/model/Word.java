package model;

public class Word {

    private String valueEnglish;
    private String valueUkrainian;

    private Word() {
    }

    public Word(String valueEnglish, String valueUkrainian) {
        this.valueEnglish = valueEnglish;
        this.valueUkrainian = valueUkrainian;
    }

    public String getValueEnglish() {
        return valueEnglish;
    }

    public String getValueUkrainian(){
        return valueUkrainian;
    }

}
