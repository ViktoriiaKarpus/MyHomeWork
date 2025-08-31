package hw6.task1_ArrayList;

import java.util.ArrayList;

public class Task3 {
    //Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Wife");
        str.add("Husband");
        str.add("Son");
        str.add("Daughter");
        str.add("Grandparents");
        str.add("Grandchildren");

        String longest = str.get(0);
        for (String s : str){
            if(s.length() > longest.length()){
                longest = s;
            }
        }
        System.out.println(longest);

    }
}
