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

        peopleMyObj.newPerson("Mattias", "Andersson");    //person[0]
        peopleMyObj.newPerson("Martin", "Zimmerman");     //person[1]

        todoMyObj.newTodo("TestText 1");
        todoMyObj.newTodo("TestText 2");

    }

    @After
    public void destroy_array_reset_to_zero() {
        todoMyObj.clear();
        peopleMyObj.clear();

    }

    @Test
    public void test_find_by_id(){

        Todo actual = todoMyObj.findById(2);
        assertEquals( 2, actual.getTodoId());
        assertEquals( "TestText 2", actual.getDescription());

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

        //Expected
        int expected = 2;
        //Actual
        int actual = todoMyObj.findAll().length;
        Todo[] array = todoMyObj.findAll();

        for(int i =0; i < array.length; i++){
            assertEquals(i+1, array[i].getTodoId());
        }

          assertEquals(expected, actual);

    }

    @Test
    public void test_array_return_array_length() {

        int expected = 2;
        int actual = todoMyObj.size();

        assertEquals(expected, actual);
    }

    @Test
    public void test_find_by_id_non_existed_id(){


        //Actual
        Todo actual = todoMyObj.findById(5);
        assertNull (actual);

    }

    @Test
    public void find_if_done_true(){
        //Setup
        Todo[] array = todoMyObj.findAll();
        array[0].setDone(true);

        Todo[] obj = todoMyObj.findByDoneStatus(true);
           int arrayLength = obj.length;
           System.out.println(arrayLength);

           assertEquals(1,arrayLength);

    }
    @Test
    public void find_by_assignee(){
        //Setup
            Person[] personArray = peopleMyObj.findAll();
            Todo[]  todoArray = todoMyObj.findAll();
        //Assign person to first todo
            todoArray[0].setAssignee(personArray[0]);
        //Send in the question
            Todo[] obj = todoMyObj.findByAssignee(personArray[0]);
            int arrayLength = obj.length;
        //Return one added
            assertEquals(1, arrayLength);

    }


}
