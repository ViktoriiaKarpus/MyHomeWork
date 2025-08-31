package hw6.task7_LinkedHashMap;

import java.util.LinkedHashMap;

public class Task2 {

    public static void main(String[] args) {
        //Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Ivanov", "12-25-74-69");
        phoneBook.put("Petrov", "12-14-36-77");
        phoneBook.put("Sidorov", "12-01-02-44");
        phoneBook.put("Nori", "15-12-47-46");
        phoneBook.put("Antorni", "17-24-74-88");

        System.out.println(phoneBook.get("Nori"));

    }
}
