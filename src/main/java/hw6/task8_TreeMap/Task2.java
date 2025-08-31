package hw6.task8_TreeMap;

import java.util.TreeMap;

public class Task2 {

    public static void main(String[] args) {
        //Найдите минимальный и максимальный ключ в TreeMap.
        TreeMap<String, Integer> information = new TreeMap<>();
        information.put("Terese", 89);
        information.put("Anika", 100);
        information.put("Kris", 55);
        information.put("Andrea", 79);
        information.put("Sandra", 60);

        System.out.println(information.firstKey());
        System.out.println(information.lastKey());
    }
}
