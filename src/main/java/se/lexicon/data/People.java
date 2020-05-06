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
        Person result = null;

        //Find matching id number in person array
        for (int i = 0; i < person.length; i++) {
            if (personId == person[i].getPersonId()) {
                result = person[i];
            }
        }
        return result;
    }

    public void newPerson(String firstName, String lastName) {
    //New person: Create a unique number and input of First and last name
    Person newPerson = new Person(PersonSequencer.nextPersonId(), firstName,lastName);
        //Add new memory slot into array
        Person[] newArray = Arrays.copyOf(person, person.length + 1);
            newArray[newArray.length - 1] = newPerson;
        person = newArray;
    }

    public void clear() {
        person = new Person[0];
    }

    public boolean deletePerson(int target){
        //Find index via id number (target)
        Integer index = null;

        for(int i=0; i < person.length; i++){
            if(person[i].getPersonId() == target){
                index =i;
            }
        }

        if(index != null) {
            //Temp array with new size
            Person[] useList = new Person[person.length - 1];
            int nonDeletedElements = person.length - (index + 1);

            //Copy the elements before the index pos
            System.arraycopy(person, 0, useList, 0, index);
            //Copy the elements after the index pos
            System.arraycopy(person, index + 1, useList, index, nonDeletedElements);
            //Update person array with new list
            person = useList;
            return true;
        } else {
            return false;
        }
    }
}
