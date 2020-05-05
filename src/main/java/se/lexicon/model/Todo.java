package se.lexicon.model;

/**
 Create Todo class in the model package
 a. Required fields are todoId (int and final), description (String), done (boolean) and assignee (Person).
 b. Make a constructor that take in todoId (int) and a description (String).
 c. Create needed getters and setters.
 d. Unit test Todo class with Junit.
 e. Commit changes.
 **/
public class Todo {

    private final int todoId;
    private String description;
    private boolean done;
    private Person assignee;

    //Constructor
    public Todo(int todoId, String description) {
        this.todoId = todoId;
        setDescription(description);
    }

    /**Getters**/
    public int getTodoId() {
        return todoId;
    }
    public String getDescription() {
        return description;
    }
    public boolean isDone() {
        return done;
    }
    public Person getAssignee() {
        return assignee;
    }

    /**Setters**/
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    /***Not Included***/
    public void print(){
        System.out.println("Id: "+todoId);
        System.out.println("Todo: "+description);
        System.out.println("Is Done: "+isDone());
    }
    /***Not Included***/

}




