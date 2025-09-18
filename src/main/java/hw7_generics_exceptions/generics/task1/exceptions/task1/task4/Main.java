package hw7_generics_exceptions.generics.task1.exceptions.task1.task4;

import hw7_generics_exceptions.generics.task1.exceptions.task1.task4.exception.InvalidEmailException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //Создание и использование собственного непроверяемого исключения
    //Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
    // является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям,
    // функция должна выбрасывать непроверяемое исключение.

    // Создание и использование собственного непроверяемого исключения:
    //Создайте класс исключения, наследуемый от RuntimeException.
    //Используйте регулярные выражения (Pattern и Matcher из пакета java.util.regex)
    // для проверки формата строки.
    //Используйте throw для генерации исключения при обнаружении невалидного адреса.

    public static void validateEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(!matcher.matches()){
            throw new InvalidEmailException("Not correct email: " + email);
        }
        System.out.println("Email " + email  + " is correct");
    }

    public static void main(String[] args) {
        validateEmail("vivi@example.com");
        try {
            validateEmail("wrong-email.example.com");
        }catch (InvalidEmailException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
