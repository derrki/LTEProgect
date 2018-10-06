package newClasses;

public class Main {
    public static void main(String[] args) {

        String[] pronouns = Pronouns.getPronounsEngl();
        String[] verbs = Verbs.getVerb();

        String[] pronounsUa = Pronouns.getPronounsUa();
        String[] verbsUa = Verbs.getVerbsUa();

        int i = 0;
        int j = 0;

        for (String pronoun : pronouns) {
            j = 0;
            for (String verb : verbs) {
               String resultEngl = PresentSimpleClass.getSentensEngl(pronoun, verb);
                String resultUa = PresentSimpleClass.getSentensEngl(pronounsUa[i], verbsUa[j]);

                System.out.println(resultEngl + "  - " + resultUa);

                j++;
            }
            i++;
        }

    }
}
