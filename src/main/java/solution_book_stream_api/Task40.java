package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;

public class Task40 {

    //Проверка уникальности по полю
    // Проверь, что все объекты User имеют уникальные email.

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Alice", "alice@mail.com"),
                new User("Bob", "bob@mail.com"),
                new User("Carol", "alice@mail.com"),
                new User("Dave", "dave@mail.com")
        );

        long distinctCount = users.stream()
                .map(User::getEmail)
                .distinct()
                .count();


        boolean allUnique = distinctCount == users.size();

        System.out.println("All emails unique: " + allUnique);

    }

    public static class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "User{name='" + name + "', email='" + email + "'}";
        }
    }
}
