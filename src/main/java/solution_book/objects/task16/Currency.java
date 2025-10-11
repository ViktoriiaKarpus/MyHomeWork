package solution_book.objects.task16;

import java.util.Objects;

public class Currency {

    //Класс Currency
    // Поля: code, symbol. Равенство — по code, строковое представление — символ.

    private String code;
    private String symbol;

    public Currency(String code, String symbol) {
        this.code = code;
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Currency that = (Currency) obj;
        return this.code.equals(that.code);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(code);
    }

    @Override
    public String toString(){
        return "Symbol: " + this.symbol;
    }

}
