package mock_tasks_page2;

import java.util.Arrays;

public class Task_9_ {


    //Проверка анаграммы
    //listen = silent
    public static boolean isAnagram(String a, String b){
        char [] ac = a.toCharArray();
        char [] bc = b.toCharArray();

        Arrays.sort(ac);
        Arrays.sort(bc);

        return Arrays.equals(ac, bc);
    }


    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        isAnagram(a, b);
        System.out.println(isAnagram(a, b));

    }
}
