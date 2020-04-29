package se.lexicon.model;
/**
 Create Person class in package model.
 a. Required fields are personId (int and final), firstName and lastName (String).
 b. Make a constructor that can build the object.
 c. Create needed getters and setters.
 d. Unit test with Junit.
 e. Commit changes.
 **/
public class Person {

    private int personId;
    private String firstName;
    private String lastName;

    //Constructor
    public Person(int personId, String firstName, String lastName) {
        setPersonId(personId);
        setFirstName(firstName);
        setLastName(lastName);
    }

    /** Getters **/
    public int getPersonId() {
        return personId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    /** Setters **/
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
