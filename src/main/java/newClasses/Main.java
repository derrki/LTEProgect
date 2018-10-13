package newClasses;

import model.Verb;

public class Main {
    public static void main(String[] args) {


        String[] pronouns = Pronouns.getPronounsEngl();
        String[] verbs = Verbs.getVerb();

        String[] pronounsUa = Pronouns.getPronounsUa();
        String[] verbsUa = Verbs.getVerbsUa();

        int i = 0;
        int j;
        int k = 1;

        for (String pronoun : pronouns) {
            j = 0;
            for (String verb : verbs) {

                if(isaBoolean(verb) && pronoun.equals("he") || pronoun.equals("she") || pronoun.equals("it")) {
                    Verb.returnVerbPlusS(verb);
                }
                String resultEngl = PresentSimpleClass.getSentensEngl(pronoun, verb);
                String resultUa = PresentSimpleClass.getSentensEngl(pronounsUa[i], verbsUa[j]);

                System.out.println((k++)  +"  " + resultEngl + "  - " + resultUa);
                j++;
            }
            i++;
        }
    }

    private static boolean isaBoolean(String verb) {
        return verb != "CAN" && verb != "MAY" && verb != "MUST";
    }
}
