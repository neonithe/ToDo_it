package se.lexicon;

import se.lexicon.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person(1, "H", "A");
        Person person2 = new Person(2, "H", "A");
        System.out.println(person.getPersonId());
        System.out.println(person2.getPersonId());
    }
}
