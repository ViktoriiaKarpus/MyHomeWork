package solution_book.objects.task26;

import java.util.Objects;

public class PhoneNumber {

    //Класс PhoneNumber
    // Поля: countryCode, number. Равенство — по обоим полям.
    // Нормализуй номер при сравнении (+7 и 007 считаются равными).

    private String countryCode;
    private String number;

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
    }

    private static String normalizeDigits(String s) {
        if (s == null) return "0";

        String digitsOnly = s.replaceAll("\\D+", "");

        int i = 0;
        while (i < digitsOnly.length() && digitsOnly.charAt(i) == '0') {
            i++;
        }

        String trimmed;
        if (i == digitsOnly.length()) {
            trimmed = "";
        } else {
            trimmed = digitsOnly.substring(i);
        }
        return trimmed.isEmpty() ? "0" : trimmed;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) obj;
        return normalizeDigits(this.countryCode).equals(normalizeDigits(that.countryCode)) &&
                normalizeDigits(this.number).equals(normalizeDigits(that.number));
    }

    @Override
    public int hashCode(){
        return Objects.hash(normalizeDigits(countryCode), normalizeDigits(number));
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode='" + countryCode + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
