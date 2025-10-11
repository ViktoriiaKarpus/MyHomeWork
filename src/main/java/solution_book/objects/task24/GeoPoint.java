package solution_book.objects.task24;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class GeoPoint {
    //Класс GeoPoint
    // Поля: latitude, longitude. equals() и hashCode() — с учётом округления до 4 знаков.

    private double latitude;
    private double longitude;

    public GeoPoint(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private double rounded( double value){
        return BigDecimal.valueOf(value).setScale(4, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoPoint that = (GeoPoint) o;
        return Double.compare(rounded(latitude), rounded(that.latitude)) == 0 &&
                Double.compare(rounded(longitude), rounded(that.longitude)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rounded(latitude), rounded(longitude));
    }


    @Override
    public String toString() {
        return "GeoPoint{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

}
