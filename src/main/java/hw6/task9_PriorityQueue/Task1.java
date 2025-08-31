package hw6.task9_PriorityQueue;

import java.util.PriorityQueue;

public class Task1 {
    //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }

    }
}
