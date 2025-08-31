package hw6.programms.task1;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();

        registry.addDocument(new Passport("123456789"));
        registry.addDocument(new ForeignPassport("1234564558789"));
        registry.addDocument(new DriverLicense("1234551145586789"));

        System.out.println("Does ID: 123456789 exist? : " + registry.exists("123456789"));

        System.out.println("Does ID: 11258456789 exist? : " + registry.exists("11258456789"));

    }
}
