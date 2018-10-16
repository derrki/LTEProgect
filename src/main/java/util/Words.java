package util;

import model.Verb;

public class Words {
    private static String value;

    static char[] fromWordToCharacter(String valueWord){
        char[] charsWord;
        charsWord = valueWord.toCharArray();
        return charsWord;
    }

    public String returnCorrectEndingOfWord(Verb verbWord){

          String result = String.valueOf(new StringBuilder(verbWord.getValueEnglish()).append('s'));
          return result;
    }
}
