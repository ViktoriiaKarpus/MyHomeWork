package tests.complex_tasks_tests;

import hw_complex_tasks.InvalidUserException;
import hw_complex_tasks.User;
import hw_complex_tasks.UserValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest extends UserValidatorUtils {

    @Test
    public void testValidateName_TheNameBeginWithTheCapitalLetter() {
        User user = new User("John", 25, "John@example.com");

        assertDoesNotThrow(() -> userValidator.validateName(user));
    }

    @Test
    public void testValidateName_EmptyName() {
        User user = new User("", 25, "John@example.com");

        assertThrows(InvalidUserException.class,
                () -> userValidator.validateName(user));
    }

    @Test
    public void testValidateName_Null() {
        User user = new User(null, 25, "John@example.com");

        assertThrows(InvalidUserException.class,
                () -> userValidator.validateName(user));
    }

    @Test
    public void testValidateName_TheNameBeginWithTheSmallLetter() {
        User user = new User("john", 25, "John@example.com");

        assertThrows(InvalidUserException.class,
                () -> userValidator.validateName(user));
    }

    @Test
    public void testValidateName_TheNameWithSpaceAround() {
        User user = new User(" John ", 25, "John@example.com");

        assertThrows(InvalidUserException.class,
                () -> userValidator.validateName(user));
    }

    @Test
    public void testValidateName_TheNameWithNumber() {
        User user = new User("John1 ", 25, "John@example.com");

        assertDoesNotThrow(() -> userValidator.validateName(user));

    }

    @Test
    public void testValidateName_TheNameWithOneLetter() {
        User user = new User("J", 25, "John@example.com");

        assertDoesNotThrow(() -> userValidator.validateName(user));
    }

    @Test
    public void testValidateAge_Age18() {
        User user = new User("John", 18, "John@example.com");

        assertDoesNotThrow(() -> userValidator.validateAge(user));
    }

    @Test
    public void testValidateAge_Age17() {
        User user = new User("John", 17, "John@example.com");

        assertThrows(InvalidUserException.class,
                () -> userValidator.validateAge(user));
    }

    @Test
    public void testValidateAge_Age100() {
        User user = new User("John", 100, "John@example.com");

        assertDoesNotThrow(() -> userValidator.validateAge(user));
    }

    @Test
    public void testValidateAge_Age101() {
        User user = new User("John", 101, "John@example.com");

        assertThrows(InvalidUserException.class,
                () -> userValidator.validateAge(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "john@example.com",
            "a@b.co",
            "user+tag@example.com",
            "john_doe-123@domain457.com",
            "sub.domain@example.com"
    })
    public void testValidateEmail_Valid(String email) {
        User user = new User("John", 100, email);

        assertDoesNotThrow(() -> userValidator.validateEmail(user));
    }


    @ParameterizedTest
    @ValueSource(strings = {
            "john@",
            "john@@example.com",
            "Johnexample.com",
            "@example.com",
            " john@example.com",
            "john@example.com "
    })

    public void testValidateEmail_Invalid(String email) {
        User user = new User("John", 100, email);

        assertThrows(InvalidUserException.class,
                () -> userValidator.validateEmail(user));
    }

    @Test
    public void testValidateEnabled_DefaultIsTrue() {
        User user = new User("", 101, "john@example.com");

        assertThrows(InvalidUserException.class,
                () -> new UserValidator().validateName(user));

    }

    @Test
    public void testValidateDisabled_NoExceptionShouldBeThrown() {
        UserValidator.setValidationEnabled(false);

        User user = new User("", 101, "john@example.com");

        assertDoesNotThrow(() -> new UserValidator().validateName(user));

    }

    @Test
    public void testValidateReEnabled_ShouldThrowAgain() {
        UserValidator.setValidationEnabled(false);
        UserValidator.setValidationEnabled(true);

        User user = new User("", 101, "john@example.com");

        assertThrows(InvalidUserException.class,
                () -> new UserValidator().validateName(user));
    }
}
