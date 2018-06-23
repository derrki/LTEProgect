import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestClassPronoun {

    Pronoun pronoun = new Pronoun();

    @Test
    public void test_return_pronoun_I_with_capital_leters_if_user_entered_i() {
        pronoun.setPronounValue("i");
        String expectedPronoun = "I";
        String actualPronoun = pronoun.retutnIWidthCapitalLeters();
        assertEquals(expectedPronoun, actualPronoun);
    }

    @Test
    public void test_return_pronoun_with_capital_leters() {
        pronoun.setPronounValue("I");
        String expectedPronoun = "I";
        String actualPronoun = pronoun.retutnIWidthCapitalLeters();
        assertEquals(expectedPronoun, actualPronoun);
    }

    @Test
    public void test_returning_different_pronoun() {
        pronoun.setPronounValue("you");
        String expectedPronoun = "you";
        String actualPronoun = pronoun.retutnIWidthCapitalLeters();
        assertEquals(expectedPronoun, actualPronoun);
    }
}
