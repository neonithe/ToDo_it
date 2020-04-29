package se.lexicon.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person test;

    @Before
    public void add_values() throws Exception{
        test = new Person(1,"TestFirstName", "TestLastName");
    }

    @Test
    public void return_right_field(){

        assertEquals(1, test.getPersonId());
        assertEquals("TestFirstName", test.getFirstName());
        assertEquals("TestLastName", test.getLastName());
    }



}
