package static_final_public_default;

public class Person {
    /**
     * Создайте класс Person с полями:
     * private String firstName
     * private String lastName
     * private final String ssn — номер социального страхования.
     * Реализуйте конструктор для всех трёх полей,
     * геттеры для всех полей,
     * сеттеры только для firstName и lastName,
     * метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
     * В main: создайте несколько объектов,
     * измените имя у одного и выведите информацию.
     */

    private String firstName;
    private String lastName;
    private final String ssn;


    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void printPersonInfo() {
        System.out.println("First name: " + firstName + " Last Name: " + lastName + " SSN: " + ssn);
    }
}
