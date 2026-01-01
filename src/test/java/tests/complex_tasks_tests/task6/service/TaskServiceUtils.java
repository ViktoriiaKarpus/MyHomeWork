package tests.complex_tasks_tests.task6.service;

import hw_complex_tasks.task6.TaskService;
import org.junit.jupiter.api.BeforeEach;

public class TaskServiceUtils {
    protected TaskService taskService;

    @BeforeEach
    public void setUpTest() {
        taskService = new TaskService();
    }
}
