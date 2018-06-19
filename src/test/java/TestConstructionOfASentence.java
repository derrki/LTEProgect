import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class TestConstructionOfASentence {

    @Test
    public void test_build_a_sentence_with_one_word(){

        Sentence sentence = new Sentence("go");
        String simpleSentence = sentence.returnSentens();
        assertEquals("go!", simpleSentence);
    }

    @Test
    public void test_return_translation_of_the_word(){
        Pronoun pronoun = new Pronoun("I", "я");
        String translation = pronoun.getTranslation();
        assertEquals("я", translation);
    }

}
