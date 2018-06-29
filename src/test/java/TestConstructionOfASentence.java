import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class TestConstructionOfASentence {

    Sentence sentense = new Sentence();
    Pronoun pronoun = new Pronoun("I", "я");

    @Test
    public void test_build_a_sentence_with_one_word() {
        Sentence sentence = new Sentence("go");
        String simpleSentence = sentence.returnSentens();
        assertEquals("go!", simpleSentence);
    }

    @Test
    @Ignore
    public void test_build_a_sentence_with_two_words() {
        String expectedSentens = "I go.";
        Verb verb = new Verb("go", "йду");
        String actualSentens = sentense.buildSentens(pronoun, verb);
        assertEquals(expectedSentens, actualSentens);
    }

    @Test
    public void test_return_translation_of_the_word() {
        String translation = pronoun.getTranslation();
        assertEquals("я", translation);
    }

    @Test
    public void test_return_the_eginning_of_the_sentence_with_capital_letters() {
        Verb verb = new Verb("go", "йду");
        assertTrue("Я йду".equals(sentense.sentenseToUpperCase(pronoun, verb)));
    }
}
