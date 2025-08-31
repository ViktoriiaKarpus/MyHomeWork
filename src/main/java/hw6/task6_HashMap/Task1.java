package hw6.task6_HashMap;

import java.util.HashMap;

public class Task1 {
    //Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
    public static void main(String[] args) {
        HashMap<String, Integer> nameAndAge = new HashMap<>();
        nameAndAge.put("Alesya", 25);
        nameAndAge.put("Anatoliy", 35);
        nameAndAge.put("Niko", 73);
        nameAndAge.put("Mio", 15);
        nameAndAge.put("Veronika", 36);

        System.out.println(nameAndAge);

    }
}
