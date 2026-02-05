package hw_pattern.task10_Distance_ML_TO_KM;

public class Kilometers implements Distance{

    private double kilometers;

    public Kilometers(double kilometers) {
        this.kilometers = kilometers;
    }
    @Override
    public double convert() {
        return kilometers;
    }
}
