package hw6.task2_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {

    //Реализуйте очередь задач с LinkedList.
    //Добавьте 3 задачи и обработайте их в порядке поступления.
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("Task 1: Check email");
        taskQueue.add("Task 2: Send a letter");
        taskQueue.add("Task 3: Find a bug");

        while (!taskQueue.isEmpty()) {
            String task = taskQueue.poll();
            System.out.println("Processing : " + task);
        }
    }
}
