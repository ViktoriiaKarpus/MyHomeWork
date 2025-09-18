package hw7_generics_exceptions.generics.task1.exceptions.task1.task3;

public class Main {
    //Создание и использование собственного проверяемого исключения
    //Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
    // Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.

    //Создание и использование собственного проверяемого исключения:
    //Создайте собственный класс исключения, наследуя его от класса Exception.
    //В методе используйте ключевое слово throw для генерации вашего исключения при неверных условиях.
    //Метод должен быть объявлен с ключевым словом throws.


    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 0 || age > 150){
            throw new InvalidAgeException("Not correct age: " +  age);
        }
        System.out.println("Age " + age + " is appropriate");
    }

    public static void main(String[] args) {
        try{
            validateAge(25);
            validateAge(-5);
        }catch (InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
