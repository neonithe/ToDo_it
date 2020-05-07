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

        peopleMyObj.newPerson("Mattias", "Andersson");      //person[0]   id 1
        peopleMyObj.newPerson("Martin", "Zimmerman");       //person[1]   id 2

        todoMyObj.newTodo("TestText 1");                //todo[0]   id 1
        todoMyObj.newTodo("TestText 2");                //todo[1]   id 2

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
    @Test
    public void find_by_assignee_id_return_1_to_array(){
        //Setup
            Person[] personArray = peopleMyObj.findAll();
            Todo[]  todoArray = todoMyObj.findAll();

        //Assign person to first todo ( todo[0] id 1 )
            todoArray[0].setAssignee(personArray[0]);

        //Send in the question
            Todo[] obj = todoMyObj.findByAssigneeId(1);
            int arrayLength = obj.length;

        //Return one added
            assertEquals(1, arrayLength);

    }
    @Test
    public void find_unassigned_Todos_return_1_to_array(){
        //Setup
            Todo[] todoArray = todoMyObj.findAll();
            Person[] personArray = peopleMyObj.findAll();

        //Of a array of 2 i set one assigned, this should return 1 in Unassigned array
            todoArray[0].setAssignee(personArray[0]);

            Todo[] array = todoMyObj.findUnassignedTodoItems();
            int arrayLength = array.length;
            assertEquals(1, arrayLength);

    }
    @Test
    public void delete_todo(){

        assertEquals(true, todoMyObj.deleteTodo(1));
        assertEquals(todoMyObj.findAll().length, 1);
        assertNotNull(todoMyObj.findById(2));
        assertNull(todoMyObj.findById(1));

    }


}
