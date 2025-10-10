package solution_book.objects.task7;

public class Person implements Comparable<Person>{
    //Класс Person
    // Поля: firstName, lastName.
    // Реализуй интерфейс Comparable<Person>, сравнивая по фамилии и имени.



    private String firstName;
    private String lastName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Person other){
        int lastCmp = this.lastName.compareTo(other.lastName);
        if(lastCmp !=0){
            return lastCmp;
        }

        return this.firstName.compareTo(other.firstName);
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
