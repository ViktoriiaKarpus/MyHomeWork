package hw_pattern.task6_GUIFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory macFactory = new MacFactory();
        macFactory.createButton().click();
        macFactory.createMenu().find();
        macFactory.createWindow().draw();

        GUIFactory windowsFactory = new WindowsFactory();
        windowsFactory.createButton().click();
        windowsFactory.createMenu().find();
        windowsFactory.createWindow().draw();
    }
}
