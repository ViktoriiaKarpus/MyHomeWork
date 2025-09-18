package hw7_generics_exceptions.generics.task1.exceptions.task1.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {
    //Обработка проверяемого исключения
    //Условие задачи:
    //Напишите программу, которая пытается открыть файл с именем "data.txt".
    // Если файл не найден, программа должна обработать исключение и вывести сообщение:
    // "Файл не найден".

    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("data.txt");
            System.out.println("The File is found");
        } catch (FileNotFoundException e){
            System.out.println("The File isn't found");
        }
    }
}
