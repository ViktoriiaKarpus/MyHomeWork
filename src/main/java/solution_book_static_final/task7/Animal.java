package solution_book_static_final.task7;

public class Animal {
    //7. Имя животного в наследнике
    // Создай базовый класс Animal, содержащий поле с именем.
    // Это поле должно быть доступно в классе-наследнике (например, Dog), но не должно быть видно извне.
    // Пояснение: выбери модификатор доступа, который даёт доступ в иерархии, но ограничивает внешний доступ.



    protected String name;

    public Animal(String name) {
       this.name =name;
    }

}
