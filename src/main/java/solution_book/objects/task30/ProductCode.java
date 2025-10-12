package solution_book.objects.task30;

import java.util.Objects;

public class ProductCode {
    //Класс ProductCode
    // Поле: code. Два кода равны, если совпадают первые 8 символов.
    // hashCode() тоже должен учитывать только первые 8.

    private String code;

    public ProductCode(String code) {
        this.code = code;
    }

    private String first8Symbols() {
        return code.substring(0, Math.min(8, code.length()));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProductCode that = (ProductCode) obj;
        return Objects.equals(this.first8Symbols(), that.first8Symbols());
    }

    @Override
    public int hashCode() {
        return Objects.hash(first8Symbols());
    }

    @Override
    public String toString() {
        return "ProductCode{" +
                "code='" + code + '\'' +
                '}';
    }

}
