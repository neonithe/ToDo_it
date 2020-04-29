package se.lexicon.data;

import org.junit.Before;
import org.junit.Test;

import static se.lexicon.data.PersonSequencer.*;
import static org.junit.Assert.assertEquals;

public class PersonSequencerTest {

    @Before
    public void clearAll(){
            reset();
    }

    @Test
    public void nextId_return_one(){
        // Expected result
        int expected = 1;

        // Actual result
        int actual = nextPersonId();

        // Compare expected and actual, return true or false
        assertEquals(expected, actual);
    }

}
