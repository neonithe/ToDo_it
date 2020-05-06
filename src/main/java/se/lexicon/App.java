package se.lexicon;

import se.lexicon.data.People;
import se.lexicon.data.PersonSequencer;
import se.lexicon.data.TodoItems;
import se.lexicon.data.TodoSequencer;
import se.lexicon.model.Person;
import se.lexicon.model.Todo;

public class App 
{
    public static void main( String[] args )
    {

    }

}

/** Allt här under är kod som jag har använt för att testa funktionerna. Och jag har ett project löpande
 * vid sidan om där jag med testar begrepp.
 *
 * Och för att utveckla tankemönster för hur jag ska kunna utföra uppgifterna. Det tar tid,
 * men behöver den tiden för att få det att sätta sig. Som i detta fallet med objekt, vilket jag tyckte
 * var svårt att greppa hur de funkade i en array. Det var just det hur referenser funkar
 * och hur man får dem att samarbeta.
 */

/*********************TESTAD KOD******************************************
  /*  En massa testkod

     People myObj = new People();
        TodoItems myTodoItems = new TodoItems();


        newPersona("Mattias", "Andersson");
        newPersona("Martin","Zimmerman");
        newPersona("Sofia","Sonesson");
        newPersona("Hannah","Svensson");

        newTodosTrue("Test this first1", true);
        newTodosTrue("Test this first2", true);
        newTodosTrue("Test this first3", false);
        newTodosTrue("Test this first4", false);
        newTodosTrue("Test this first5", true);

        // Array Size
        //   System.out.println(myObj.size());
        // Find all

        // Find by user id
        //   myObj.findById(2).print();

        // Find by status
        // Done not done?
        // set TodoId 1 to done
        TodoItems. printAll();


    }
    *************************************************************************  Person ***
    public static int newId(){
        int newId = PersonSequencer.nextPersonId();
        return newId;
    }
    public static void newPersona(String fN, String lN){
        People myObj = new People();
        Person person = new Person(App.newId(),fN,lN);
        myObj.newPerson(person);
    }
    *************************************************************************  TODO ***
    public static int newIdTodo(){
        int newIdTodo = TodoSequencer.nextTodoId();
        return newIdTodo;
    }
    public static void newTodos(String desk){
        TodoItems myObj = new TodoItems();
        Todo todo = new Todo(newIdTodo(),desk);
        myObj.newTodo(todo);
    }
    public static void newTodosTrue(String desk, boolean done){
        Todo myObj = new Todo(newIdTodo(),desk);
        myObj.setDone(done);

    private static GetSetConst[] todo = new GetSetConst[0];
    private static Person[] person = new Person[0];

    private static int id;
    private static int idPerson;

    public static void main(String[] args) {

        /************************** SETUP ******************************

  addNew("Test of text", false);
    addNew("Sofia", true);
    addNew("Martin", true);
    addNew("Mattias", true);
    addNew("Hannah", false);
    addNew("Hello ", true);

    addNewPerson("Martin");
    addNewPerson("Sofia");
    addNewPerson("Hannah");
    addNewPerson("Linn");
    addNewPerson("Mattias");

    addAssign(4, person[0]);
    findPerson(person[1]);




    //Print
//    for(int i=0; i<todo.length; i++) { todo[i].print(); }
//    todo[1].print();
//    for(int i=0; i<person.length; i++) { person[i].print(); }
    //End setup



            Person[] array = GetSetConstTesting.findAll();

        for (int j = 0; j < array.length; j++) {
        array[j].print();
        }


        System.out.println("------------");

        deletePerson(4);
        runNewList();


        }
public static void runNewList(){
        for(int i=0; i < person.length; i++ ){
        person[i].print();
        }
        }

public static void findIndexDelete(int target){
        Person[] array = GetSetConstTesting.findAll();

        for(int i=0; i < array.length; i++){
        if(array[i].getNr() == target){
        //    deletePerson(array,i);
        array[i].print();
        }
        }
        }

public static Person[] deletePerson(int target){

        //Find index via id number (target)
        int index =0;

        for(int i=0; i < person.length; i++){
        if(person[i].getNr() == target){
        index =i;
        }
        }

        //Temp array with new
        Person[] useList = new Person[person.length - 1];
        int nonDeletedElements = person.length - (index+1);

        //Copy the elements before the index pos
        System.arraycopy(person,0,useList,0,index);
        //Copy the elements after the index pos
        System.arraycopy(person,index+1,useList,index,nonDeletedElements);
        //Update person array with new list
        person = useList;

        return person;
        }

public static Person[] findAll() {
        return person;
        }
*/
/******************* Person *************************
/*public static int nrGenPerson(){
        return ++idPerson;
        }
public static void extendArrayPerson(Person obj){
        Person[] temp = new Person[0];
        temp = Arrays.copyOf(person,person.length+1);
        temp[person.length] = obj;
        person = temp;
        }
public static void addNewPerson(String name) {
        Person obj = new Person(name, nrGenPerson());
        GetSetConstTesting.extendArrayPerson(obj);
        }*/
/******************** Todo ***************************
/*public static int nrGen(){
        return ++id;
        }
public static void extendArray(GetSetConst obj){
        GetSetConst[] temp = new GetSetConst[0];
        temp = Arrays.copyOf(todo,todo.length+1);
        temp[todo.length] = obj;
        todo = temp;
        }

public static void addNew(String text, boolean done) {
        GetSetConst obj = new GetSetConst(text,nrGen());
        obj.setDone(done);

        GetSetConstTesting.extendArray(obj);
        }

public static void addAssign(int todoId, Person pers){

        for(int i =0; i<todo.length; i++) {
        if (todoId == todo[i].getNr()) {
        todo[i].setAssign(pers);
        }
        }
        }
public static void findPerson(Person pers){
        for(int i=0; i<todo.length; i++){
        if(pers == todo[i].getAssign()){
        System.out.println("Found it");
        }
        }
        }

        }





 // Skapa ny temporär array för att lägga till de objekt som är klara
 GetSetConst[] tempArray = new GetSetConst[0];
 int[] temp1 = {1, 2, 3};
 int[] useList = new int[0]; // Lista vi ska använda

 int[] temp = Arrays.copyOf(useList, useList.length + 1);   //temp är temporär
 temp[useList.length] = 4;
 useList = temp;


 temp = Arrays.copyOf(useList, useList.length + 1);   //temp är temporär
 temp[useList.length] = 2;
 useList = temp;

 System.out.println(Arrays.toString(useList));


 for(int i=0; i<todo.length; i++){
 if(todo[i].isDone() == true){
 tempArray[tempArray.length + 1];

 tempArray[tempArray.length-1] = todo[i];

 }
 }


 * GetSetConst newInput1 = new GetSetConst("s", 1);
 * newInput1.setDone(false);
 * <p>
 * System.out.println(newInput1.isDone());
 * System.out.println(newInput1.getNr());
 * System.out.println(newInput1.getText());
 *

 public static GetSetConst[] findDone2(boolean doneStatus){

 GetSetConst[] useList = new GetSetConst[0];
 for(int i=0; i<todo.length; i++){
 if(todo[i].isDone() == doneStatus) {
 GetSetConst[] tempArray = Arrays.copyOf(useList, useList.length + 1);
 tempArray[useList.length] = todo[i];
 useList = tempArray;
 }
 }
 return useList;
 }

 for (int i = 0; i < array.length; i++) {
 if (array[i].getNr() == target) {
 System.out.println("Index is:" + i);
 array[i].print();
 removeElement(array, i);
 }
 }

 ***************************************************************************/
