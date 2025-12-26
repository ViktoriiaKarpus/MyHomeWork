package hw_complex_tasks.task2;

public class UserValidator {

    private static boolean validationEnabled = true;

    public static final String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    public static void setValidationEnabled(boolean enabled) {
        validationEnabled = enabled;
    }

    public void validateName(User user) {
        if (!validationEnabled) return;
        String name = user.getName();
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidUserException("The Name cannot be empty");
        }

        char firstLetter = name.charAt(0);
        if (!Character.isUpperCase(firstLetter)) {
            throw new InvalidUserException("The name has to begin from the capital letter");
        }
    }

    public void validateAge(User user) {
        if (!validationEnabled) return;

        int age = user.getAge();

        if (age < 18) {
            throw new InvalidUserException("The User is less than 18 years old");
        }

        if (age > 100) {
            throw new InvalidUserException("The User is more than 100 years old");
        }
    }

    public void validateEmail(User user) {
        if (!validationEnabled) return;

        if (!user.getEmail().matches(regex)) {
            throw new InvalidUserException("The Email cannot contain such symbols");
        }

    }

}
