package se.lexicon.model;

public class Person {

    private final int personId;
    private String firstName;
    private String lastName;

    //Constructor
    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
