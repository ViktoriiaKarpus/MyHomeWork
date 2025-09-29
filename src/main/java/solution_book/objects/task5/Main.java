package solution_book.objects.task5;

public class Main {
    //Класс Task
    // Поля: description, priority.
    // Переопредели toString(), чтобы при выводе в консоль задача показывалась как [HIGH] Сделать отчет.
    public static void main(String[] args) {
        Task task = new Task("Make the report", "HIGH");

        System.out.println(task.toString());
    }
}
