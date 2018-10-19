package model;

import model.Pronoun;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestPronounClass {

    Pronoun pronoun = new Pronoun("i", "я");

    @Test
    public void test_return_pronoun_I_with_capital_leters_if_user_entered_i() {
        String expectedPronoun = "I";
        String actualPronoun = pronoun.retutnIWidthCapitalLeters(pronoun.getValueEnglish());
        assertEquals(expectedPronoun, actualPronoun);
    }

}
