package test_pack.Main.test1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ObjectOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
    }

    @Test
    @DisplayName("Add persons")
    public void addPersonTest() {

        Person p1 = new Person(1, "Magnus", LocalDate.of(2001, 11, 21));
        Person p2 = new Person(2, "Hans", LocalDate.of(1999, 04, 12));
        Person p3 = new Person(3, "Lars", LocalDate.of(2004, 07, 15));
        Person p4 = new Person(4, "Benny", LocalDate.of(2003, 01, 3));
        Person p5 = new Person(5, "Børge", LocalDate.of(1995, 10, 9));

        PersonManager m1 = new PersonManager();

        m1.addPerson(p1);
        m1.addPerson(p2);
        m1.addPerson(p3);
        m1.addPerson(p4);
        m1.addPerson(p5);

        System.out.println(m1.getPersonList());
        System.out.println("Moving on to next test...\n");

        Iterator<Person> iterator = m1.getPersonList().iterator();

        // Removes the next person in line AND prints out who the next person in line is.
        while(iterator.hasNext()){
            System.out.println(m1.getPersonList());
            m1.getNextPerson();
            m1.whoIsNext();
            System.out.println("\n Next person in line is: " + m1.whoIsNext() + "\n");

        }


        // Removes the person if the name is Lars
        /*while(iterator.hasNext()){
            Person person = iterator.next();
            if (person.getName().equals("Lars")){
                iterator.remove();
            }
        }*/
    }
}
