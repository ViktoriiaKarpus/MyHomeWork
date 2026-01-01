package tests.complex_tasks_tests.task2.task;

import hw_complex_tasks.task2.UserValidator;
import org.junit.jupiter.api.BeforeEach;

public class UserValidatorUtils {

    protected UserValidator userValidator;

    @BeforeEach
    public void setUpTest(){
        userValidator = new UserValidator();
    }
}
