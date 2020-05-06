package se.lexicon.data;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.model.Person;
import se.lexicon.data.People;

import static org.junit.Assert.assertEquals;
import static se.lexicon.data.People.*;

public class PeopleTest {

    private People myObj = new People();

/*    @Before
    public void clearAll() {
        myObj.clear();
    }*/
    @Before
    public void add_values() throws Exception {
        Person[] person = new Person[2];

            person[0] = new Person(1, "Mattias", "Andersson");
            person[1] = new Person(2, "Martin", "Zimmerman");

    }

     /**Function test of:
     * Size
     * Return array
     * find by id
     * create new person
     * clear array
     * delete person
     **/

    @Test
    public void test_array_return_array_length() {

        int expected = 2;
        int actual = myObj.size(2);

        assertEquals(expected, actual);
    }

 /*   @Test
    public void test_return_array() {

   /*     //Expected

        //Actual
        Person[] expected =
        Person[] array = myObj.findAll();

        assertEquals(expected, array);

    }
    @Test
    public void test_find_person_from_id(){

        //Expected
        Person[] testPerson = new Person[0];
        testPerson[0] = new Person(1, "Mattias", "Andersson");
        Person expected = testPerson[0];
        //Actual
        Person actual = myObj.findById(1);

        assertEquals(expected, actual);


    }*/


}




