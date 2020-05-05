package se.lexicon.data;

import se.lexicon.model.Person;
import se.lexicon.model.Todo;
import java.util.Arrays;

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

    public void newTodo(String text) {

    Todo newTodo = new Todo(TodoSequencer.nextTodoId(), text);

        Todo[] newArray = Arrays.copyOf(todo, todo.length + 1);
            newArray[newArray.length - 1] = newTodo;
        todo = newArray;
    }

    public void clear() {
        Todo[] todo = new Todo[0];
    }

       public Todo[] findByDoneStatus(boolean doneStatus){

           Todo[] useList = new Todo[0];

           for(int i=0; i<todo.length; i++){
               if(todo[i].isDone() == doneStatus) {
                   Todo[] tempArray = Arrays.copyOf(useList, useList.length + 1);
                        tempArray[useList.length] = todo[i];
                   useList = tempArray;
               }
           }
           return useList;
        }

        public Todo[] findByAssignee(Person assignee){
           Todo[] useList = new Todo[0];

           for(int i=0; i < todo.length; i++){
               if(todo[i].getAssignee() == assignee){
                   Todo[] tempArray = Arrays.copyOf(useList, useList.length +1){
                       tempArray[useList.length] = todo[i];
                   useList = tempArray;
                   }
               }
           }
            return useList;
        }
        /*** This is not working ***/
/*        public Todo[] findByAssigneeId(int personId) {
           Todo[] useList = new Todo[0];

           for (int i = 0; i < todo.length; i++) {
               if (todo[i]. == personId) {
                   Todo[] tempArray = Arrays.copyOf(useList, useList.length + 1) {
                       tempArray[useList.length] = todo[i];
                       useList = tempArray;
                   }
               }
           }
           return useList;
       } */

        public Todo[] findUnassignedTodoItems(){
            Todo[] useList = new Todo[0];

            for (int i = 0; i < todo.length; i++) {
                if (todo[i].getAssignee() == null) {
                    Todo[] tempArray = Arrays.copyOf(useList, useList.length + 1) {
                        tempArray[useList.length] = todo[i];
                        useList = tempArray;
                    }
                }
            }
            return useList;
        }

        /**
         Add the following to TodoItems AND People class.
         a. Functionality to remove object from array. (not nulling)
         First: you need to find the correct array index of the object.
         Second: You need to rebuild array by excluding the object on found index.

         b. Unit test changes
         c. Commit and Push to GitHub
         **/
  /*     public static void removeFromArray(){

            for()
*/

}
