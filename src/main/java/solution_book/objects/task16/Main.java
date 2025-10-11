package solution_book.objects.task16;

public class Main {

    //Класс Currency
    // Поля: code, symbol. Равенство — по code, строковое представление — символ.

    public static void main(String[] args) {
        Currency usd = new Currency("USD", "$");
        Currency eur = new Currency("EUR", "€");

        System.out.println(usd.equals(new Currency("USD", "$")));
        System.out.println(eur.equals(new Currency("EUR", "€")));
    }
}
