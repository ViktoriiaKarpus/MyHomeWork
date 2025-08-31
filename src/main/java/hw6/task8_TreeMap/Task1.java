package hw6.task8_TreeMap;

import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        //Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы).
        // Выведите отсортированные данные.

        TreeMap<String, Integer> information = new TreeMap<>();
        information.put("Terese", 89);
        information.put("Anika", 100);
        information.put("Kris", 55);
        information.put("Andrea", 79);
        information.put("Sandra", 60);

        System.out.println(information);

    }
}
