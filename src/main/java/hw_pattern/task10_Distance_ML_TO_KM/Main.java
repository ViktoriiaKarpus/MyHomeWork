package hw_pattern.task10_Distance_ML_TO_KM;

public class Main {
    public static void main(String[] args) {

        Miles oldSystem = new Miles(12);

        Distance adapter = new MilesToKilometersAdapter(oldSystem);

        System.out.println(adapter.convert());
    }
}
