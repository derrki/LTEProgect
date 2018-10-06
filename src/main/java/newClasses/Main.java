package newClasses;

public class Main {
    public static void main(String[] args) {

        String[] pronouns = Pronouns.getPronouns();
        String[] verbs = Verbs.getVerb();

        for (String pronoun : pronouns) {
            for (String verb : verbs) {

               String result = PresentSimpleClass.getSentens(pronoun, verb);
                System.out.println(result);

            }
        }

    }
}
