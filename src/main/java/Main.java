/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {

        Pronoun [] pronoun = {new Pronoun("i", "я"), new Pronoun("you", "ти"),
                new Pronoun("we", "ми"), new Pronoun("you", "ви"), new Pronoun("they", "вони"),
                new Pronoun("he", "він"), new Pronoun("she", "вона"), new Pronoun("it", "воно")};

        Sentence sentence = new Sentence();
                                                    // я       ти       ми      ви         вони    він    вона    воно
        Verb verbs =  new Verb("know", new String[]{"знаю", "знаєш", "знаєм", "знаєте", "знають", "знає", "знає", "знає"});



        String[] translite = verbs.getVerbAlternatuveTranslation();

        for (int i = 0; i < translite.length; i++) {
            System.out.println(sentence.buildSentens(pronoun[i].getPronounValue(), verbs.getVerbValue()));
            System.out.println(sentence.buildSentens(pronoun[i].getPronounTranslation(), translite[i]));
        }
    }
}
