package solution_book_stream_api.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //Преобразование объектов в одно поле
    // Из списка User получи список всех их email-адресов через map().

    public static void main(String[] args) {

        User u1 = new User("Niki", "Niki@example.com");
        User u2 = new User("Stefi", "stefi@example.com");
        User u3 = new User("Alan", "alan@example.com");

        List<String> contacts = new ArrayList<>();
        contacts.add(u1.getEmail());
        contacts.add(u2.getEmail());
        contacts.add(u3.getEmail());

        List<String> emailUpper = contacts.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(emailUpper);


    }

}
