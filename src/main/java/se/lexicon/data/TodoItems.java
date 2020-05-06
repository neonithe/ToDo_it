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

        public static Todo[] deleteTodo(int target){
            //Find index via id number (target)
            int index =0;

            for(int i=0; i < todo.length; i++){
                if(todo[i].getTodoId() == target){
                    index =i;
                }
            }

            //Temp array with new size
            Todo[] useList = new Todo[todo.length - 1];
            int nonDeletedElements = todo.length - (index+1);

                    //Copy the elements before the index pos
                    System.arraycopy(todo,0,useList,0,index);
                    //Copy the elements after the index pos
                    System.arraycopy(todo,index+1,useList,index,nonDeletedElements);
                    //Update person array with new list
                    todo = useList;

            return todo;
        }

}
