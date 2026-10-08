package solution_book_static_final.task2;

public class User {
    //2. Счётчик пользователей
    // Создай класс User, где каждый пользователь имеет имя.
    // Класс должен вести подсчёт общего количества созданных пользователей.
    // Этот счётчик должен автоматически увеличиваться при создании каждого нового объекта.
    // Также добавь возможность вывести общее количество пользователей.
    // Пояснение: реши, как отслеживать общее количество объектов независимо от экземпляров.


    public String getName() {
        return name;
    }

    public String name;
    public static int count = 0;

    User(String name) {
        this.name = name;
        incrementCount();
    }

    public static void incrementCount(){
        count++;
    }


    public static int getCount(){
        return count;
    }

}
