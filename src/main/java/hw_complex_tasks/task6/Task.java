package hw_complex_tasks.task6;

import java.time.LocalDate;

public class Task<T> {
    //Task<T>: Класс, представляющий задачу. Должен содержать поля для ID, статуса, приоритета и даты.

    private T id;
    private String status;
    private int priority;
    private LocalDate date;

    public Task(T id, String status, int priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
