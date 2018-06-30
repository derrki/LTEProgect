import ClassesOfWords.EnglishWord;

public class Pronoun extends WordDictionary{


    public Pronoun(EnglishWord englishWordWord, Translation translationWord) {
        super(englishWordWord, translationWord);
    }

    public String retutnIWidthCapitalLeters() {
        if (super.getEnglishWord().toString() == "i" || super.getEnglishWord().toString() == "I"){
            return "I";
        } else {
            return super.getEnglishWord().toString();
        }
    }

    
}
