package hw6.task1_ArrayList;

import java.util.ArrayList;

public class Task1 {
    //Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(15);
        arrayList.add(2);
        arrayList.add(78);
        arrayList.add(45);
        System.out.println(arrayList);
        arrayList.add(77);
        System.out.println(arrayList);

    }
}
