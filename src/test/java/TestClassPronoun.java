import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestClassPronoun {

    Pronoun pronoun = new Pronoun("I", "я");

    @Test
    public void test_return_pronoun_I_with_capital_leters_if_user_entered_i() {
        pronoun.setValue("i");
        String expectedPronoun = "I";
        String actualPronoun = pronoun.retutnIWidthCapitalLeters();
        assertEquals(expectedPronoun, actualPronoun);
    }

    @Test
    public void test_return_pronoun_with_capital_leters() {
        pronoun.setValue("I");
        String expectedPronoun = "I";
        String actualPronoun = pronoun.retutnIWidthCapitalLeters();
        assertEquals(expectedPronoun, actualPronoun);
    }

    @Test
    public void test_returning_different_pronoun() {
        pronoun.setValue("you");
        String expectedPronoun = "you";
        String actualPronoun = pronoun.retutnIWidthCapitalLeters();
        assertEquals(expectedPronoun, actualPronoun);
    }
}
