package solution_book.objects.task5;

public class Task {
    //Класс Task
    // Поля: description, priority.
    // Переопредели toString(), чтобы при выводе в консоль задача показывалась как [HIGH] Сделать отчет.

    private String description;
    private String priority;

    public Task(String description, String priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString(){
        return "[" + priority + "] " + description;
    }

}
