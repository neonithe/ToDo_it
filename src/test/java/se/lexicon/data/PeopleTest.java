package se.lexicon.data;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.model.Person;

import static org.junit.Assert.*;

public class PeopleTest {

    private People myObj = new People();


    @Before
    public void initiate_class() {
        myObj.clear();

        myObj.newPerson("Mattias", "Andersson");    //person[0]
        myObj.newPerson("Martin", "Zimmerman");     //person[1]

    }

    @After
    public void destroy_class() {
        myObj.clear();
    }

    @Test
    public void is_clear(){

        myObj.clear();
        int actual = myObj.findAll().length;
        int expected =0;

        assertEquals(expected,actual);
    }

    @Test
    public void test_array_return_array_length() {

        int expected = 2;
        int actual = myObj.size();

        assertEquals(expected, actual);
    }

    @Test
    public void test_return_array() {

        //Expected
        int expected = 2;
        //Actual
        int actual = myObj.findAll().length;

        assertEquals(expected, actual);

    }

    @Test
    public void test_find_by_id_non_existed_id(){


        //Actual
        Person actual = myObj.findById(3);

        assertNull (actual);

    }
    @Test
    public void test_find_by_id(){

        Person actual = myObj.findById(2);
        assertEquals( 2, actual.getPersonId());
        assertEquals( "Martin", actual.getFirstName());
        assertEquals( "Zimmerman", actual.getLastName());
    }

    @Test
    public void test_delete_person(){

        assertEquals(true, myObj.deletePerson(1));
        assertEquals(myObj.findAll().length, 1);
        assertNotNull(myObj.findById(2));
        assertNull(myObj.findById(1));

    }
    @Test
    public void test_delete_person_remove_id_10(){

        assertEquals(false, myObj.deletePerson(10));
        assertEquals(myObj.findAll().length, 2);
        assertNotNull(myObj.findById(2));
        assertNotNull(myObj.findById(1));

    }
    @Test
    public void test_add_new_person_not_reusing_id() {

        // FIX ME!!
        assertEquals(true, myObj.deletePerson(2));
        assertEquals(myObj.findAll().length, 1);
        assertNotNull(myObj.findById(1));
        assertNull(myObj.findById(2));

        myObj.newPerson("Bengt", "Svensson");
        assertNotNull(myObj.findById(3));
    }

    @Test
    public void new_person(){

        myObj.newPerson("Sofia","Sonesson");
        int a = myObj.findAll().length;

        assertEquals(3,a);

    }
}




