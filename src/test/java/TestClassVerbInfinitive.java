import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestClassVerbInfinitive {

    VerbInfinitive verb = new VerbInfinitive("go", "goes");

    @Test
    public void test_return_of_the_verb_in_the_infinitive(){
        String expectedVerb = "to go";
        String actualVerb = verb.returnVerbInTheInfinitive("go");
        assertEquals(expectedVerb, actualVerb);
    }

    @Test
    public void test_add_ending_verb_s(){
        String expectedVerb = "goes";
        String actualVerb = verb.returnEndingVerbS("go");
        assertEquals(expectedVerb, actualVerb);
    }
}