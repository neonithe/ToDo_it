package se.lexicon.data;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.model.Person;
import se.lexicon.model.Todo;

import java.util.Arrays;

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

    //    peopleMyObj.newPerson("Mattias", "Andersson");    //person[0]
    //    peopleMyObj.newPerson("Martin", "Zimmerman");     //person[1]

        todoMyObj.newTodo("TestText 1");
        todoMyObj.newTodo("TestText 2");

    }

    @After
    public void destroy_array_reset_to_zero() {
        todoMyObj.clear();
        peopleMyObj.clear();

    }

    @Test
    public void new_person(){

        todoMyObj.newTodo("Test-text 3");
        int actual = todoMyObj.findAll().length;

        assertEquals(3,actual);

    }

    @Test
    public void is_clear(){

        todoMyObj.clear();
        int actual = todoMyObj.findAll().length;
        int expected =0;

        assertEquals(expected,actual);
    }

    @Test
    public void test_return_array() {
        todoMyObj.clear();
        Todo[] array = todoMyObj.findAll();
        for(int i=0; i < todoMyObj.findAll().length; i++){
            System.out.println(Arrays.toString(array));
            System.out.println(array[i].getTodoId());
            System.out.println(array[i].getDescription());
            System.out.println(array[i].getAssignee());
            System.out.println(array[i].isDone());
        }
        //Expected
    //    int expected = 2;
        //Actual
      //  int actual = todoMyObj.findAll().length;

        //  assertEquals(expected, actual);

    }

    @Test
    public void test_array_return_array_length() {

        int expected = 2;
        int actual = todoMyObj.size();

        assertEquals(expected, actual);
    }



}
