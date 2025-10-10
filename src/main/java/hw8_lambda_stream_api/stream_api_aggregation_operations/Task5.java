package hw8_lambda_stream_api.stream_api_aggregation_operations;

import java.util.Arrays;
import java.util.List;

public class Task5 {

    //Проверка наличия хотя бы одного элемента по условию
    //Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
    // который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1200, 55, 62, 76, 545, 23, 78, 99, 145);

        boolean hasEvenNumber = numbers.stream()
                .anyMatch(numb -> numb % 2 == 0);

        if(hasEvenNumber){
            System.out.println("The list has at least one even number");
        }else{
            System.out.println("No even numbers in the list");
        }
    }
}
