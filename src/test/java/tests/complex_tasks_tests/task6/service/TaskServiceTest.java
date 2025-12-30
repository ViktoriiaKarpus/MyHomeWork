package tests.complex_tasks_tests.task6.service;

import hw_complex_tasks.task6.Task;
import hw_complex_tasks.task6.TaskService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskServiceTest extends TaskServiceUtils {

    @Test
    public void testAddTask_PositiveTest() {
        Task<Integer> task = new Task<>(
                1,
                "open",
                1,
                LocalDate.of(2025, 12, 30)
        );

        TaskService<Integer> taskService = new TaskService<>();

        taskService.addTask(task);

        List<Task<Integer>> result = taskService.findtask(task);

        assertEquals(1, result.size());
    }

    @Test
    public void testAddTask_negativeTest(){
        TaskService<Integer> taskService = new TaskService<>();
        taskService.addTask(null);

        assertTrue(taskService.findtask(new Task<>(null, null, 0, null)).isEmpty());
    }

    @Test
    public void testRemoveTaskById_PositiveTest(){

    }

}
