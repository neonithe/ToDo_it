package se.lexicon.data;
/**
 Create a new class TodoSequencer in data package that have the same behaviour as PersonSequencer but different method names.
 a. Unit test TodoSequencer with Junit.
 b. Commit changes.
 **/
public class TodoSequencer {

    private static int todoId;

    public static int nextTodoId(){
        return ++todoId;
    }

    public static void reset(){
        todoId = 0;
    }

}
