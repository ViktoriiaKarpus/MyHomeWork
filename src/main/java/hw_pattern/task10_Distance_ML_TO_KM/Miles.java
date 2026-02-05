package hw_pattern.task10_Distance_ML_TO_KM;

public class Miles implements Distance {

    private double miles;

    public Miles(double miles) {
        this.miles = miles;
    }

    public double getMiles() {
        return miles;
    }

    @Override
    public double convert() {
        return miles;
    }
}
