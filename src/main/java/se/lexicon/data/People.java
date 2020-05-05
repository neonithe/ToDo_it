package se.lexicon.data;

import se.lexicon.model.Person;
import java.util.Arrays;

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

    public void newPerson(String firstName, String lastName) {

    Person newPerson = new Person(PersonSequencer.nextPersonId(), firstName,lastName);

        Person[] newArray = Arrays.copyOf(person, person.length + 1);
            newArray[newArray.length - 1] = newPerson;
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

    public static void findIndexDelete(int target){

        for(int i=0; i < person.length; i++){
            if(person[i].getPersonId() == target){
                deletePerson(person,i);
                person[i].print();
            }
        }
    }

    public static Person[] deletePerson( Person[] array, int index){
        //
        Person[] useList = new Person[array.length - 1];
        int nonDeletedElements = array.length - (index+1);

        //Copy the elements before the index pos
        System.arraycopy(array,0,useList,0,index);
        //Copy the elements after the index pos
        System.arraycopy(array,index+1,useList,index,nonDeletedElements);

        return useList;
    }


}
