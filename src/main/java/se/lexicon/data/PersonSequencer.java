package se.lexicon.data;
/**
 Create a new class PersonSequencer in data package.
 a. In PersonSequencer create a private static int variable called personId.
 b. Add a static method called nextPersonId that increment and return the next personId value.
 c. Add a static method called reset() that sets the personId variable to 0.
 d. Unit test PersonSequencer with Junit.
 e. Commit changes
 **/
public class PersonSequencer {

    private static int personId;

    public static int nextPersonId(){
        return ++personId;
    }

    public static void reset(){
        personId = 0;
    }

}
