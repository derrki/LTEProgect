package controller;

import model.Pronoun;
import model.Sentence;
import model.Verb;

public class MainController {
    public static void main(String[] args) {


        Verb[] verbs = new Verb[10];
        verbs[0] = new Verb("want", "хотіти");
        verbs[1] = new Verb("like", "любити");
        verbs[2] = new Verb("need", "потребувати");
        verbs[3] = new Verb("do", "робити");
        verbs[4] = new Verb("live", "жити");
        verbs[5] = new Verb("work", "працювати");
        verbs[6] = new Verb("know", "знати");
        verbs[7] = new Verb("get", "отримувати");
        verbs[8] = new Verb("see", "бачити");
        verbs[9] = new Verb("hear", "чути");

//        for (Verb mVerb : verbs) {
//            System.out.println(mVerb);
//        }

        Pronoun[] pronouns = new Pronoun[8];
        pronouns[0] = new Pronoun("he","я");
        pronouns[1] = new Pronoun("you","ти");
        pronouns[2] = new Pronoun("we","ми");
        pronouns[3] = new Pronoun("they","вони");
        pronouns[4] = new Pronoun("he","він");
        pronouns[5] = new Pronoun("she","вона");
        pronouns[6] = new Pronoun("it","воно");
        pronouns[7] = new Pronoun("you","ви");

//        for (Pronoun mPronoun: pronouns) {
//            System.out.println(mPronoun);
//        }

        String[] stringSentences = new String[10];
        Sentence simpleSentens;

        int i = 0;
        int j;

        for (Pronoun pronoun : pronouns) {
            j = 0;
            for (Verb verb : verbs) {
                //if(isaBoolean(verb.getValueEnglish()) && pronoun.equals("he") || pronoun.equals("she") || pronoun.equals("it")) {
                if(pronoun.getValueEnglish().equals("he") || pronoun.getValueEnglish().equals("she") || pronoun.getValueEnglish().equals("it")) {
                  Verb.returnVerbPlusS(verb.getValueEnglish());
                }
                simpleSentens = new Sentence(pronoun, verb);
                stringSentences[i] = simpleSentens.buildSimpleSentens(pronoun, verb);
                System.out.println(stringSentences[i]);
                j++;
            }
            i++;
        }
    }

    private static boolean isaBoolean(String verb) {
        return verb != "CAN" && verb != "MAY" && verb != "MUST";
    }
}
