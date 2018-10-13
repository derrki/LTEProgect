package controller;

import model.Pronoun;
import model.Verb;

public class MainController {
    public static void main(String[] args) {


        Verb[] verb = new Verb[10];
        verb[0] = new Verb("want", "хотіти");
        verb[1] = new Verb("like", "любити");
        verb[2] = new Verb("need", "потребувати");
        verb[3] = new Verb("do", "робити");
        verb[4] = new Verb("live", "жити");
        verb[5] = new Verb("work", "працювати");
        verb[6] = new Verb("know", "знати");
        verb[7] = new Verb("get", "отримувати");
        verb[8] = new Verb("see", "бачити");
        verb[9] = new Verb("hear", "чути");

        for (Verb mVerb : verb) {
            System.out.println(mVerb);
        }

    }
}
