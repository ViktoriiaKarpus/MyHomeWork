package hw6.task7_LinkedHashMap;

import java.util.LinkedHashMap;

public class Task1 {
    public static void main(String[] args) {
        //Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
        LinkedHashMap<String, String> lhp = new LinkedHashMap<>();

        lhp.put("Google", "12:00");
        lhp.put("youtube", "11:45");
        lhp.put("github", "12:10");
        lhp.put("mizila", "13:20");
        lhp.put("microsoft edge", "15:25");

        System.out.println(lhp);

    }
}
