package hw_pattern.task12_SmartHome;

public class SmartHomeFacade {
    private AC ac = new AC();
    private Light light = new Light();
    private SecuritySystem securitySystem = new SecuritySystem();

    public void turnOnHome(){
        ac.turnOn();
        light.turnOn();
        securitySystem.activate();
    }

    public void turnOffHome(){
        ac.turnOff();
        light.turnOff();
        securitySystem.deactivate();
    }
}
