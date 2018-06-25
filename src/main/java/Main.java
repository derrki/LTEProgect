/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {

        PersonalPronoun[] pronoun = {new PersonalPronoun("i", "я"), new PersonalPronoun("you", "ти"),
                new PersonalPronoun("we", "ми"), new PersonalPronoun("you", "ви"), new PersonalPronoun("they", "вони"),
                new PersonalPronoun("he", "він"), new PersonalPronoun("she", "вона"), new PersonalPronoun("it", "воно")};

        Sentence sentence = new Sentence();
                                                    // я       ти       ми      ви         вони    він    вона    воно
        SimpleVerb verbs =  new SimpleVerb("know", new String[]{"знаю", "знаєш", "знаєм", "знаєте", "знають", "знає", "знає", "знає"});



        String[] translite = verbs.getVerbAlternatuveTranslation();

        for (int i = 0; i < translite.length; i++) {
            System.out.println(sentence.buildSentens(pronoun[i].getPronounValue(), verbs.getVerbValue()));
            System.out.println(sentence.buildSentens(pronoun[i].getPronounTranslation(), translite[i]));
        }
    }
}
