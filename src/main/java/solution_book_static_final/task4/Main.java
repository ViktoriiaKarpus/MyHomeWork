package solution_book_static_final.task4;

public class Main {
    //4. Инкапсуляция возраста
    // Определи класс Person с полем age.
    // Поле не должно быть доступно напрямую — возраст должен устанавливаться и читаться только через методы.
    // Добавь метод увеличения возраста.
    // Пояснение: продумай, какие модификаторы доступа подходят для обеспечения инкапсуляции.

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setAge(32);
        person1.setName("Steve");
        person1.increaseAge();
        person1.getAge();
        person1.printAge();

    }
}
