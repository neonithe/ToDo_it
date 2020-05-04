package se.lexicon.data;

import se.lexicon.model.Person;

import java.util.Arrays;

/**
 Create a new class called People inside the data package.
 a. Have a private static Person array declared and instantiated as empty and not null (new Person[0]).
 b. Add a method public int size() that return the length of the array.
 c. Add a method public Person[] findAll() that return the person array.
 d. Add a method public Person findById(int personId) that return the person that has a mathing personId as
 the passed in parameter.

 e. Add a method that creates a new Person, adds newly created object in the array and then return the created object.
 You have to “expand” the Person array. (tip: send in parameters needed to create the Person object and
 use the PersonSequencer to give you a unique personId)

 f. Add a method public void clear() that clears all Person objects from the Person array.
 g. Unit test People class with Junit.
 h. Commit changes.
 **/

public class People {

    private static Person[] person = new Person[0];

    public int size() {
        return person.length;
    }

    public Person[] findAll() {
        return person;
    }

    public Person findById(int personId) {
        Person result = person[0];

        for (int i = 0; i < person.length; i++){
            if (personId == person[i].getPersonId()) {
                    result = person[i];
            }
    }
        return result;
    }

    public void newPerson(Person newPers) {
        Person[] newArray = Arrays.copyOf(person, person.length + 1);
        newArray[newArray.length - 1] = newPers;
        person = newArray;
    }

    public void clear() {
        Person[] person = new Person[0];
    }

    /**
     Add the following to TodoItems AND People class.
     a. Functionality to remove object from array. (not nulling)
     First: you need to find the correct array index of the object.
     Second: You need to rebuild array by excluding the object on found index.

     b. Unit test changes
     c. Commit and Push to GitHub
     **/


    /****Inte enl insturktion***************************************** PRINT FUNCTION */
    public static void printAll() {
        for(int i = 0; i<person.length; i++){
            person[i].print();
        }
    }
    public static void printTest(){
        System.out.println(person[2].getPersonId());
    }
    /****Inte enl insturktion******/

}
