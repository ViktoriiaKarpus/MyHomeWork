package hw7_generics_exceptions.generics.task1.generics.task1;

public class Task1 {
    //Задача на дженерик класс
    //Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
    // Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.

    public static void main(String[] args) {
        Box<String> tBox = new Box<>();
        tBox.setElement("Hello");

        System.out.println(tBox.getElement());

        Box<Integer> integerBox = new Box<>();
        integerBox.setElement(12345);

        System.out.println(integerBox.getElement());
    }
}
