package hw_pattern.task5_Furniture;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        modernChair.sitOn();
        modernTable.use();

        FurnitureFactory classicfactory = new ClassicFurnitureFactory();
        Chair classicChair = classicfactory.createChair();
        Table classicTable = classicfactory.createTable();

        classicChair.sitOn();
        classicTable.use();
    }
}
