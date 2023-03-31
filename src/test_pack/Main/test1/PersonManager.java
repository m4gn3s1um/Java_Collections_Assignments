package test_pack.Main.test1;

import java.util.*;

public class PersonManager {

    private static PersonManager instance;
    private LinkedList<Person> personList;

    public PersonManager() {
        //personList = new ArrayList<>();
        personList = new LinkedList<>();
    }

    public static synchronized PersonManager getInstance() {
        if (instance == null) {
            instance = new PersonManager();
        }
        return instance;
    }

    public LinkedList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(LinkedList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void addPersons(Person... persons) {
        for (Person person : persons) {
            personList.add(person);
        }
    }

    public Person getNextPerson(){
        return personList.poll();
    }

    public Person whoIsNext(){
        return personList.peek();
    }
}
