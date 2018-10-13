package model;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class TestConstructionOfASentence {

    Pronoun pronoun = new Pronoun("You", "ти");
    Verb verb = new Verb("want", "хотіти");
    Sentence sentense = new Sentence(pronoun, verb);

    @Test
    public void test_build_a_sentence_with_two_words() {
        String expectedSentens = "You want";
        String actualSentens = sentense.buildSimpleSentens(pronoun.getValueEnglish(), verb.getValueEnglish());
        assertEquals(expectedSentens, actualSentens);
    }
}
