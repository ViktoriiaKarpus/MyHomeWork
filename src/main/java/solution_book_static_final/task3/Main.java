package solution_book_static_final.task3;

public class Main {

    public static void main(String[] args) {

        Country usa = new Country("US");
        Country russia = new Country("RU");

        usa.printCodeOfTheCountry();;
        russia.printCodeOfTheCountry();

        System.out.println(usa.getCodeOfTheCountry());
    }
}
