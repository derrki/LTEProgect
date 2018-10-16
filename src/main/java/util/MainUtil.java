package util;

import model.Verb;

import java.util.Arrays;

public class MainUtil {
    public static void main(String[] args) {
        String verb = "finish";
        Words words = new Words();

        System.out.println(words.returnTwoEndingLettersOfWord(verb));
        System.out.println(words.returnCorrectEndingOfWord(new Verb("finish", "завершувати")));
    }
}
