package util;

import model.Verb;

public class Words {
    private static String value;

    public String returnTwoEndingLettersOfWord(String valueWord){
        char[] charsWord = valueWord.toCharArray();
        if (charsWord.length <= 2){
            return valueWord;
        } else {
        String result = String.valueOf(charsWord[charsWord.length-2]);
        result += charsWord[charsWord.length-1];
        return result;
        }
     }

    public String returnCorrectEndingOfWord(Verb verbWord){

       if((returnTwoEndingLettersOfWord(verbWord.getValueEnglish()).equals("s") ||
          (returnTwoEndingLettersOfWord(verbWord.getValueEnglish()).equals("ss") ||
          (returnTwoEndingLettersOfWord(verbWord.getValueEnglish()).equals("sh") ||
          (returnTwoEndingLettersOfWord(verbWord.getValueEnglish()).equals("ch") ||
          (returnTwoEndingLettersOfWord(verbWord.getValueEnglish()).equals("x") ||
          (returnTwoEndingLettersOfWord(verbWord.getValueEnglish()).equals("z") ||
          (returnTwoEndingLettersOfWord(verbWord.getValueEnglish()).equals("zz"))))))))){

              return String.valueOf(new StringBuilder(verbWord.getValueEnglish()).append('e').append('s'));
        } else {
           String result = String.valueOf(new StringBuilder(verbWord.getValueEnglish()).append('s'));
           return result;
       }
    }
}
