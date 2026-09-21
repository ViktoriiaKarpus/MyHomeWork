package solution_book_stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Task35 {
//Сортировка по длине и алфавиту
//    Отсортируй строки сначала по длине, затем по алфавиту при равенстве.


    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Nickalause", 25),
                new Person("Bob", 22),
                new Person("Katen", 22)
        );

        List<String> result = people.stream()
                .map(Person::getName)
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .toList();
        System.out.println(result);
    }

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }
}
