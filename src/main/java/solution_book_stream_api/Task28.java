package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Task28 {

    //Нахождение среднего значения
    // Вычисли средний возраст пользователей.
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(22, "Alice"),
                new User(25, "Bob"),
                new User(41, "Charlie")
        );

        OptionalDouble avg = users.stream()
                .mapToInt(User::getAge)
                .average();

        System.out.println(avg);           // OptionalDouble[29.333...]
        System.out.println(avg.isPresent()); // true
    }

    public static class User {

        private String name;
        private int age;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }


    }
}
