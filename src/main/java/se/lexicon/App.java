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

        newPersona("Mattias", "Andersson");
        newPersona("Martin","Zimmerman");
        newPersona("Sofia","Sonesson");
        newPersona("Hannah","Svensson");

        newTodos("Do this1");
        newTodos("Do this2");
        newTodos("Do this3");

        // Array Size
     //   System.out.println(myObj.size());
        // Find all

        // Find by user id
     //   myObj.findById(2).print();

        // Find by status
        TodoItems.printAll();
        // Done not done?


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
}
