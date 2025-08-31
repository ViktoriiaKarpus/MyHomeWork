package hw6.task7_LinkedHashMap;

import java.util.LinkedHashMap;

public class Task3 {


    public static void main(String[] args) {
        //Создайте LinkedHashMap,
        // который хранит историю просмотров пользователя (максимум 10 элементов).

        LinkedHashMap<String, String> userbrowsingHistory =
                new LinkedHashMap<>();
        userbrowsingHistory.put("Ivanov", "12:15");
        userbrowsingHistory.put("Petrov", "16:44");
        userbrowsingHistory.put("Sidorov", "12:01");
        userbrowsingHistory.put("Nori", "00:03");
        userbrowsingHistory.put("Antorni", "23:00");
        userbrowsingHistory.put("Ivanova", "12:45");
        userbrowsingHistory.put("Petrova", "16:36");
        userbrowsingHistory.put("Sidorova", "12:11");
        userbrowsingHistory.put("Noriana", "00:15");
        userbrowsingHistory.put("Antornia", "23:45");

        System.out.println(userbrowsingHistory);
        System.out.println(userbrowsingHistory.get("Nori"));
        System.out.println(userbrowsingHistory.get("Ivanova"));
    }
}
