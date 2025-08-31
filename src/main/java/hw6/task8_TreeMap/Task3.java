package hw6.task8_TreeMap;

import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        //Реализуйте TreeMap, который хранит сотрудников и их ID,
        // с возможностью поиска ближайшего большего ID.

        TreeMap<Integer, String> inf = new TreeMap<>();
        inf.put(1234567, "Vaskes");
        inf.put(1617181, "Andreas");
        inf.put(1699871, "Petros");
        inf.put(1334571, "Milos");
        inf.put(1098765, "Donals");

        System.out.println(inf.higherKey(1234567));
        System.out.println(inf.lowerKey(1334571));

    }
}
