package se.lexicon.data;

import se.lexicon.model.Person;
import se.lexicon.model.Todo;

import java.util.Arrays;

/**
 Create a new class called TodoItems inside the data package.
 a. TodoItems should have the same functionality as the People class.
 b. Unit test TodoItems class
 c. Commit changes
 **/
public class TodoItems {

    private static Todo[] todo = new Todo[0];


    public int size(){
        return todo.length;
    }

    public Todo[] findAll() {
        return todo;
    }


    public Todo findById(int todoId){
        Todo result = todo[0];

        for (int i = 0; i < todo.length; i++){
            if (todoId == todo[i].getTodoId()) {
                result = todo[i];
            }
        }
        return result;
    }

    public void newTodo(Todo newTodos) {
        Todo[] newArray = Arrays.copyOf(todo, todo.length + 1);
        newArray[newArray.length - 1] = newTodos;
        todo = newArray;
    }

    public void clear() {
        Todo[] todo = new Todo[0];
    }

        /*************************************************************************/
        /**
         Add the following methods to TodoItems class
         a. public Todo[] findByDoneStatus(boolean doneStatus) – Returns array with objects that has a matching done status.
         b. public Todo[] findByAssignee(int personId) – Returns array with objects that has an assignee with a
         personId matching.
         c. public Todo[] findByAssignee(Person assignee) – Returns array with objects that has sent in Person.
         d. public Todo[] findUnassignedTodoItems() – Returns an array of objects that does not have an assignee set.
         e. Unit test changes
         f. Commit.
         **/
       public Todo[] findByDoneStatus(boolean doneStatus){

        }

 /*       public Todo[] findByAssigneeId(int personId){
            //
            if ( personId == Person[]){
                return Person[i];
            }
        }
        public Todo[] findByAssignee(Person assignee){
            //return objects?
            return assignee;
        }
        public Todo[] findUnassignedTodoItems(){
            return objectsnotassigned;
        }  */

        /**
         Add the following to TodoItems AND People class.
         a. Functionality to remove object from array. (not nulling)
         First: you need to find the correct array index of the object.
         Second: You need to rebuild array by excluding the object on found index.

         b. Unit test changes
         c. Commit and Push to GitHub
         **/
  /*      public static void removeFromArray(){

            for()
        } */


    /****Inte enl insturktion***************************************** PRINT FUNCTION */
    public static void printAll() {
        TodoItems obj = new TodoItems();
        Todo[] array = obj.findByDoneStatus(false);
        for(int i = 0; i<array.length; i++){
            array[i].print();
        }
    }
    public static void printTest(){
        System.out.println(todo[2].getTodoId());
    }
    /****Inte enl insturktion******/

}
