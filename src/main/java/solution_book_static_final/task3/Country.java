package solution_book_static_final.task3;

public class Country {

    //3. Страна с фиксированным кодом
    // Создай класс Country, в котором указывается код страны (например, "RU" или "US").
    // Этот код задаётся один раз при создании и не может быть изменён после.
    // Он должен быть доступен извне только для чтения.
    // Пояснение: реши, как ограничить доступ на изменение, но при этом позволить читать значение.



    private final String codeOfTheCountry;// Этот код задаётся один раз при создании и не может быть изменён после.

    Country(String codeOfTheCountry) {
        this.codeOfTheCountry = codeOfTheCountry;
    }

    public String getCodeOfTheCountry() {
        return codeOfTheCountry;
    }

    public void printCodeOfTheCountry() {

        System.out.println("Code of the country: " + codeOfTheCountry);

    }



}
