package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task27 {

    //Пропуск повторов по ключу
    // Оставь только уникальные объекты по email, используя distinct() с Comparator.
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", "alice@mail.com"),
                new User("Bob", "bob@mail.com"),
                new User("Alice2", "alice@mail.com"),   // дубликат по email
                new User("Charlie", "charlie@mail.com")
        );

        List<User> result = users.stream()
                .collect(Collectors.toMap(
                        User::getEmail,                 // ключ — email
                        Function.identity(),            // значение — сам User
                        (existing, replacement) -> existing  // если email повторяется — оставляем первый
                ))
                .values()
                .stream()
                .toList();

        System.out.println(result);
    }

    public static class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return name + " <" + email + ">";
        }
    }
}
