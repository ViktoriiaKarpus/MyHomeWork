package hw6.task4_LinkedHashSet;

import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        //Создайте LinkedHashSet и добавьте в него 5 строк.
        // Проверьте порядок элементов при выводе.

        LinkedHashSet<String> str = new LinkedHashSet<>();
        str.add("Banana");
        str.add("Strawberry");
        str.add("Lime");
        str.add("Cherry");
        str.add("Watermelon");

        System.out.println(str);
    }
}
