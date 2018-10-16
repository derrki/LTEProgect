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

//    public String returnCorrectEndingOfWord(Verb verbWord){
//
//        char[]
//
//        s, -ss, -sh, -ch, -tch, -x, -z, -zz,
//
//          String result = String.valueOf(new StringBuilder(verbWord.getValueEnglish()).append('s'));
//          return result;
//    }
}
