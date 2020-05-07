package se.lexicon.data;

import se.lexicon.model.Person;
import se.lexicon.model.Todo;
import java.util.Arrays;

public class TodoItems {

    private static Todo[] todo = new Todo[0];
    private People myObj = new People();


    public int size(){
        return todo.length;
    }

    public Todo[] findAll() {
        return todo;
    }

    public Todo findById(int todoId){
        Todo result = todo[0];
        //Find matching id number in todo array
        for (int i = 0; i < todo.length; i++){
            if (todoId == todo[i].getTodoId()) {
                result = todo[i];
            }
        }
        return result;
    }

    public void newTodo(String text) {
    //New Todo: Create unique id number and text input
    Todo newTodo = new Todo(TodoSequencer.nextTodoId(), text);
        //Add new memory slot into array
        Todo[] newArray = Arrays.copyOf(todo, todo.length + 1);
            newArray[newArray.length - 1] = newTodo;
        todo = newArray;
    }

    public void clear() {
        todo = new Todo[0];
    }

       public Todo[] findByDoneStatus(boolean doneStatus){
           //Create a return array
           Todo[] useList = new Todo[0];
           //Find todos with matching input status and set into new array
           for(int i=0; i<todo.length; i++){
               if(todo[i].isDone() == doneStatus) {
                   Todo[] tempArray = Arrays.copyOf(useList, useList.length + 1);
                        tempArray[useList.length] = todo[i];
                   useList = tempArray;
               }
           }
           //Return matching input status array
           return useList;
        }

        public Todo[] findByAssignee(Person assignee){
           //Create a return array
           Todo[] useList = new Todo[0];
           //Find Assigned todos and set into new array
           for(int i=0; i < todo.length; i++){
               if(todo[i].getAssignee() == assignee){
                   Todo[] tempArray = Arrays.copyOf(useList, useList.length +1);
                       tempArray[useList.length] = todo[i];
                   useList = tempArray;
                   }
               }
            //Return assigned elements/objects array
            return useList;
           }

        public Todo[] findByAssigneeId(int personId) {
           //Create a return array
           Todo[] useList = new Todo[0];
           Person[] person = myObj.findAll();

           for (int i = 0; i < person.length; i++) {
               if (person[i].getPersonId() == personId) {           //Find person via ID

                   for(int j=0; j < todo.length; i++){              //Find todos via person array index (assignee)
                       if(todo[j].getAssignee() == person[i]){

                           Todo[] tempArray = Arrays.copyOf(useList, useList.length + 1);
                               tempArray[useList.length] = todo[i];
                               useList = tempArray;
                       }
                   }
               }
           }
           return useList;
       }

        public Todo[] findUnassignedTodoItems(){
            //Create a return array
            Todo[] useList = new Todo[0];
            //Find not assigned and set into new array
            for (int i = 0; i < todo.length; i++) {
                if (todo[i].getAssignee() == null) {
                    Todo[] tempArray = Arrays.copyOf(useList, useList.length + 1);
                        tempArray[useList.length] = todo[i];
                        useList = tempArray;
                    }
                }
            //Return not assigned elements/objects array
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
