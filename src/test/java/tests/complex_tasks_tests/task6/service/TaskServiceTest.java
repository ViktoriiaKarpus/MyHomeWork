package tests.complex_tasks_tests.task6.service;

import hw_complex_tasks.task6.Task;
import hw_complex_tasks.task6.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.TestExecutionResult;

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

        List<Task<Integer>> result = taskService.findTask(task);

        assertEquals(1, result.size());
    }

    @Test
    public void testAddTask_negativeTest(){
        TaskService<Integer> taskService = new TaskService<>();
        taskService.addTask(null);

        assertTrue(taskService.findTask(new Task<>(null, null, 0, null)).isEmpty());
    }

    @Test
    public void testRemoveTaskById_PositiveTest(){
         Task<Integer> task = new Task<>(
                 1,
                 "open",
                 1,
                 LocalDate.now()
         );

         TaskService<Integer> taskService = new TaskService<>();

         taskService.addTask(task);

         taskService.removeTaskById(1);

         assertEquals(0, taskService.findTask(task).size());

    }

    @Test
    void testRemoveTaskById_removeNonExistingId(){
        Task<Integer> task = new Task<>(
                1,
                "open",
                1,
                LocalDate.now()
        );

        TaskService<Integer> taskService = new TaskService<>();

        taskService.addTask(task);

        taskService.removeTaskById(999);

        assertEquals(1, taskService.findTask(task).size());
    }

    @Test
    void testFindTask_positiveTest(){
        Task<Integer> task = new Task<>(
                1,
                "open",
                1,
                LocalDate.now()
        );

        TaskService<Integer> taskService = new TaskService<>();

        taskService.addTask(task);

        List<Task<Integer>> result = taskService.findTask(task);

        assertEquals(1, result.size());
    }

    @Test
    void testFindTask_emptyList_negativeTest(){
        Task<Integer> task = new Task<>(
                1,
                "open",
                1,
                LocalDate.now()
        );

        TaskService<Integer> taskService = new TaskService<>();

        List<Task<Integer>> result = taskService.findTask(task);

        assertTrue(result.isEmpty());
    }

}
