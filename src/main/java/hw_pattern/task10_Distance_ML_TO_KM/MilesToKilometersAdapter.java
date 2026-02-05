package hw_pattern.task10_Distance_ML_TO_KM;

public class MilesToKilometersAdapter implements Distance {

    private Miles miles;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    @Override
    public double convert() {
        return miles.getMiles() * 1.60934;
    }
}
