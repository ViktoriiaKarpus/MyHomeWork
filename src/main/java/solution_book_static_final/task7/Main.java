package solution_book_static_final.task7;

public class Main {
    //7. Имя животного в наследнике
    // Создай базовый класс Animal, содержащий поле с именем.
    // Это поле должно быть доступно в классе-наследнике (например, Dog), но не должно быть видно извне.
    // Пояснение: выбери модификатор доступа, который даёт доступ в иерархии, но ограничивает внешний доступ.


    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.dogSays();   // Dog Rex says woof!
    }
}
