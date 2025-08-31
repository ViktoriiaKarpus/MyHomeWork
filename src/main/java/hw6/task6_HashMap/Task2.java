package hw6.task6_HashMap;

import java.util.HashMap;

public class Task2 {

    public static void main(String[] args) {
        //Проверьте, есть ли определённое имя в HashMap.

        HashMap<String, Integer> nameAndAge = new HashMap<>();
        nameAndAge.put("Alesya", 25);
        nameAndAge.put("Anatoliy", 35);
        nameAndAge.put("Niko", 73);
        nameAndAge.put("Mio", 15);
        nameAndAge.put("Veronika", 36);

        String definiteName = "Mio";
        if (nameAndAge.containsKey(definiteName)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
