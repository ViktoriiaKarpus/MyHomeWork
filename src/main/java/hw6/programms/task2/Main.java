package hw6.programms.task2;

public class Main {
    public static void main(String[] args) {
        UserTask queue = new UserTask();

        queue.addTask(new Message("Send a message to the secretary"));
        queue.addTask(new Email("Send the email"));
        queue.addTask(new Bug("Find a bug in the system"));

        queue.processTask();

    }
}
