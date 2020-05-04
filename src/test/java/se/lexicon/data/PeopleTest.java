package se.lexicon.data;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.model.Person;
import se.lexicon.data.People;

import static org.junit.Assert.assertEquals;
import static se.lexicon.data.People.*;

public class PeopleTest {

    private People test;

    @Before
    public void add_values() throws Exception {
        Person[] person = new Person[0];
        person[0] = new Person(1, "Mattias", "Andersson");
        person[1] = new Person(2, "Martin", "Zimmerman");
    }

    @Test
    public void test_array_return_array_length() {
        People myObj = new People();

        int expected = 3;
        int actual = myObj.size();

        assertEquals(expected, actual);
    }

    @Test
    public void test_return_getPersonId() {

    }
}
 /*   @Test
    public void test_return_array(){
        People myObj = new People();

        int expected =0;
        Person[] actual = myObj.findAll();

        assertEquals(expected, actual);

    }*/



