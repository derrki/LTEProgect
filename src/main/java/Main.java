/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {

        Sentence sentence = new Sentence();

        Word personalPronoun = new Pronoun("They", "вони");
        Word simpleVerb = new VerbInfinitive("run", "бігти");

        Word verbAll = new VerbAll("work", "працювати", new String[] {"працюю", "працюєш", "працюють", "працює", "працюєм"});

        System.out.println(sentence.buildSentens(personalPronoun.getValue(), simpleVerb.getValue()));
        System.out.println(sentence.buildSentens(personalPronoun.getTranslation(), simpleVerb.getTranslation()));
        System.out.println(verbAll.getValue() + " "+ verbAll.getTranslation());

    }
}
