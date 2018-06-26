import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class TestConstructionOfASentence {

    Sentence sentense = new Sentence();
    PersonalPronoun pronoun = new PersonalPronoun("I", "я");

    @Test
    public void test_build_a_sentence_with_one_word() {
        Sentence sentence = new Sentence("go");
        String simpleSentence = sentence.returnSentens();
        assertEquals("go!", simpleSentence);
    }

    @Test
    public void test_build_a_sentence_with_two_words() {
        String expectedSentens = "I go.";
        SimpleVerb verb = new SimpleVerb("go", "йду");
        String actualSentens = sentense.buildSentens(pronoun.getValue(), verb.getValue());
        assertEquals(expectedSentens, actualSentens);
    }

    @Test
    public void test_return_translation_of_the_word() {
        String translation = pronoun.getTranslation();
        assertEquals("я", translation);
    }

    @Test
    public void test_return_the_eginning_of_the_sentence_with_capital_letters() {
        SimpleVerb verb = new SimpleVerb("go", "йду");
        assertTrue("Я йду".equals(sentense.sentenseToUpperCase(pronoun, verb)));
    }
}
