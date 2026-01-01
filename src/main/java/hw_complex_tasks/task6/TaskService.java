package hw_complex_tasks.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
    //TaskService<T>: Сервис для управления задачами, включающий методы для добавления, удаления и поиска задач.
    //Управление задачами:
    //Добавление задачи: Метод для добавления новой задачи в список.
    //Удаление задачи: Метод для удаления задачи по ID. Метод должен быть синхронизирован для предотвращения
    // конкурентного доступа.
    //Поиск задач: Методы для фильтрации задач по статусу и приоритету, а также сортировка задач по дате.
    //Обработка данных:
    //Использование Stream API для фильтрации и сортировки задач.
    //Лямбда-выражения для сортировки задач по дате.

    private List<Task<T>> tasks = new ArrayList<>();

    public void addTask(Task task) {
        if (task != null) {
            tasks.add(task);
        }
    }

    public synchronized void removeTaskById(T id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public List<Task<T>> findTask(Task<T> task) {
        return tasks.stream()
                .filter(tTask -> tTask.getPriority() == (task.getPriority()))
                .filter(tTask -> tTask.getStatus().equals(task.getStatus()))
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }
}
