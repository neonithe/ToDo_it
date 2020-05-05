package se.lexicon;

import se.lexicon.data.People;
import se.lexicon.data.PersonSequencer;
import se.lexicon.data.TodoItems;
import se.lexicon.data.TodoSequencer;
import se.lexicon.model.Person;
import se.lexicon.model.Todo;

import javax.naming.NameNotFoundException;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        People myObj = new People();
        TodoItems myTodoItems = new TodoItems();


        newPersona("Mattias", "Andersson");
        newPersona("Martin","Zimmerman");
        newPersona("Sofia","Sonesson");
        newPersona("Hannah","Svensson");

        newTodosTrue("Test this first1", true);
        newTodosTrue("Test this first2", true);
        newTodosTrue("Test this first3", false);
        newTodosTrue("Test this first4", false);
        newTodosTrue("Test this first5", true);

        // Array Size
        //   System.out.println(myObj.size());
        // Find all

        // Find by user id
        //   myObj.findById(2).print();

        // Find by status
        // Done not done?
        // set TodoId 1 to done
        TodoItems. printAll();


    }
    /*************************************************************************  Person ***/
    public static int newId(){
        int newId = PersonSequencer.nextPersonId();
        return newId;
    }
    public static void newPersona(String fN, String lN){
        People myObj = new People();
        Person person = new Person(App.newId(),fN,lN);
        myObj.newPerson(person);
    }
    /*************************************************************************  TODO ***/
    public static int newIdTodo(){
        int newIdTodo = TodoSequencer.nextTodoId();
        return newIdTodo;
    }
    public static void newTodos(String desk){
        TodoItems myObj = new TodoItems();
        Todo todo = new Todo(newIdTodo(),desk);
        myObj.newTodo(todo);
    }
    public static void newTodosTrue(String desk, boolean done){
        Todo myObj = new Todo(newIdTodo(),desk);
        myObj.setDone(done);

    }
}
