package solution_book_static_final.task4;

public class Person {
    //4. Инкапсуляция возраста
    // Определи класс Person с полем age.
    // Поле не должно быть доступно напрямую — возраст должен устанавливаться и читаться только через методы.
    // Добавь метод увеличения возраста.
    // Пояснение: продумай, какие модификаторы доступа подходят для обеспечения инкапсуляции.

    private int age; //инкапсуляция
    private static String name;//нужно ли имя, я думаю да,так как потом мы будем понимать кому добавляем возраст

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Person.name = name;
    }

    public int getAge() { // нам не нужны параметры
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void increaseAge() {
        age++;
    }

    public void printAge() {
        System.out.println("Name " + name + "Age " + age);
    }

}
