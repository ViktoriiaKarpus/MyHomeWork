package solution_book_static_final.task1;

public class Numbers {

    //1. Математические константы
    // Разработай вспомогательный класс, который содержит два числовых значения:
    // число Пи (3.14159) и число Эйлера (2.71828).
    // Эти значения не должны изменяться после объявления и должны быть доступны без создания объекта.
    // Добавь метод, который печатает обе константы.
    // Пояснение: подумай, как сделать значения "глобальными" и неизменяемыми.


    public static final double PI = 3.14159;
    public static final double EULER = 2.71828;

    private Numbers(double PI, double EULER){

    }

    public static void printConstants(){
        System.out.println("Число Пи: " + PI);
        System.out.println("Число Эйлера: " + EULER);
    }

}
