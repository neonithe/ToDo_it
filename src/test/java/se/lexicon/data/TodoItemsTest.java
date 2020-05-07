package se.lexicon.data;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.model.Person;
import se.lexicon.model.Todo;

import static org.junit.Assert.*;

public class TodoItemsTest {

    private People peopleMyObj = new People();
    private TodoItems todoMyObj = new TodoItems();

    @Before
    public void initiate_class() {
        peopleMyObj.clear();
        todoMyObj.clear();

        PersonSequencer.reset();
        TodoSequencer.reset();

        peopleMyObj.newPerson("Mattias", "Andersson");    //person[0]
        peopleMyObj.newPerson("Martin", "Zimmerman");     //person[1]

        todoMyObj.newTodo("TestText 1");
        todoMyObj.newTodo("TestText 2");

    }

    @After
    public void destroy_array_reset_to_zero() {
        todoMyObj.clear();

    }

    @Test
    public void test_return_array() {

        //Expected
        int expected = 2;
        //Actual
        int actual = todoMyObj.findAll().length;

        assertEquals(expected, actual);

    }

    @Test
    public void test_array_return_array_length() {

        int expected = 2;
        int actual = todoMyObj.size();

        assertEquals(expected, actual);
    }



}
