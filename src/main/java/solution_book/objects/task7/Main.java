package solution_book.objects.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    //Класс Person
    // Поля: firstName, lastName.
    // Реализуй интерфейс Comparable<Person>, сравнивая по фамилии и имени.

    public static void main(String[] args) {
        Person p1 = new Person("Ivanov", "Peter");
        Person p2 = new Person("Anet", "Pete");
        Person p3 = new Person("Nikolos", "Müller");

        List<Person> people = Arrays.asList(p1,p2, p3);
        Collections.sort(people);

        System.out.println(people);

    }
}
