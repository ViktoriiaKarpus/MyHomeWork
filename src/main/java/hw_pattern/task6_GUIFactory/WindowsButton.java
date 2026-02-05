package hw_pattern.task6_GUIFactory;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Windows-style button click");
    }
}
