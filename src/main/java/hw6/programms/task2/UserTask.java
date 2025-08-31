package hw6.programms.task2;

import java.util.LinkedList;
import java.util.Queue;

public class UserTask {

    private Queue<Task> tasks = new LinkedList<>();

    public void addTask(Task task){
        tasks.add(task);
    }

    public void processTask(){
        while (!tasks.isEmpty()){
            Task task = tasks.poll();
            System.out.println("Processing: " + task.getName());
        }
    }
}
