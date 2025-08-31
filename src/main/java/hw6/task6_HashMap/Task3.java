package hw6.task6_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
        //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.

        HashMap<String, Integer> user = new HashMap<>();
        user.put("Alesya", 25);
        user.put("Anatoliy", 35);
        user.put("Niko", 73);
        user.put("Mio", 15);
        user.put("Veronika", 36);
        user.put("Viki", 16);
        user.put("Kris", 27);
        user.put("Evan", 29);

        for (Map.Entry<String, Integer> entry : user.entrySet()) {
            if (entry.getValue() < 18){
                System.out.println(entry.getKey()  + "  : " + entry.getValue());
            }
        }
    }
}
