package hw6.task3_HashSet;

import java.util.HashSet;

public class Task4 {
    //Создайте HashSet, содержащий набор имен.
    // Напишите программу, которая проверяет, содержится ли ваше имя в множестве,
    // и выводит соответствующее сообщение.

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Viktoriia");
        names.add("Alice");
        names.add("Melani");

        String myName = "Viktoriia";
        if(names.contains(myName)){
            System.out.println("My name is: " + myName +  " and it in the SET");
        }else{
            System.out.println(myName + " is not in the SET");
        }
    }
}
