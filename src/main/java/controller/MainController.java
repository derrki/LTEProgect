package controller;

import model.EnglishWord;
import model.UkrainianWord;
import view.Console;
import view.Viev;

public class MainController {
    public static void main(String[] args) {
        Viev viev = new Console();

        viev.write("Привіт користувач!");
        viev.write("Введи слова для вивчення в форматі частина мови|слово|переклад");

        String string = viev.read();
        String[] word = string.split("[|]");


        EnglishWord englishWord = new EnglishWord(word[1]);
        UkrainianWord ukrainianWord = new UkrainianWord(word[2]);

        System.out.println(word[0] + word[1] + word[2]);
    }
}
