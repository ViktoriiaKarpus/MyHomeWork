package solution_book_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task24 {

    //Сортировка по нескольким критериям
    // Сначала по фамилии, потом по имени — Comparator.thenComparing().
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", "Smith"),
                new Person("Bob", "Johnson"),
                new Person("Charlie", "Smith"),
                new Person("David", "Brown"),
                new Person("Eve", "Johnson")
        );

        List<Person> result = people.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName))
                .toList();

        System.out.println(result);
    }

    public static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return lastName + " " + firstName;
        }
    }
}
