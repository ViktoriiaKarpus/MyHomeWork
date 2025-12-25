package tests.complex_tasks_tests;

import hw_complex_tasks.UserValidator;
import org.junit.jupiter.api.BeforeEach;

public class UserValidatorUtils {

    protected UserValidator userValidator;

    @BeforeEach
    public void setUpTest(){
        userValidator = new UserValidator();
    }
}
