package se.lexicon.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static se.lexicon.data.TodoSequencer.*;

public class TodoSequencerTest {

    @Before
    public void clearAll(){
        reset();
    }

    @Test
    public void nextId_return_one(){
        // Expected result
        int expected = 1;

        // Actual result
        int actual = nextTodoId();

        // Compare expected and actual, return true or false
        assertEquals(expected, actual);
    }

}
