package solution_book_stream_api.task18;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    //Преобразование в Map
    // Преобразуй список User в Map<id, name>.

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("123", "Steve Adams"),
                new User("124", "Kirk Kerl"),
                new User("125", "Adam Williams")
        );

        Map<String, String> userMap = users.stream()
                .collect(Collectors.toMap(User::getId, User::getName));

        System.out.println(userMap);
    }
}
