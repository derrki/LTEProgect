package util;

import model.Verb;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestWords {

    Words words = new Words();

    @Test
    public void test_return_two_ending_letters_of_word(){
        String expected = "rk";
        String actual = words.returnTwoEndingLettersOfWord("work");
        assertEquals(expected, actual);
    }
    @Test
    public void test_changes_the_end_of_the_word_by_adding_s(){
        String expected = "wants";
        String actual = words.returnCorrectEndingOfWord(new Verb("want", "хотіти"));
        assertEquals(expected, actual);
    }

    @Test
    public void test_changes_the_end_of_the_word_by_adding_es(){
        String expected = "finishes";
        String actual = words.returnCorrectEndingOfWord(new Verb("finish", "зікінчувати"));
        assertEquals(expected, actual);
    }
}
