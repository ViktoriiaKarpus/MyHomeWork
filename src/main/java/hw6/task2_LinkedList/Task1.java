package hw6.task2_LinkedList;

import java.util.LinkedList;

public class Task1 {
    //Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("Weather");
        str.add("Dog");
        str.add("Cat");
        str.add("Puppy");
        str.add("Kitty");

        System.out.println(str);
    }
}
