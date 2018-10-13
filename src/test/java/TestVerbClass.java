import model.Verb;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestVerbClass {

    Verb verb = new Verb();

    @Test
    public void test_return_of_the_verb_in_the_infinitive(){
        String expectedVerb = "to want";
        String actualVerb = verb.returnVerbInTheInfinitive("want");
        assertEquals(expectedVerb, actualVerb);
    }

//    @Test
//    public void test_add_ending_verb_s(){
//        String expectedVerb = "goes";
//        String actualVerb = verb.returnEndingVerbS("go");
//        assertEquals(expectedVerb, actualVerb);
//    }
}