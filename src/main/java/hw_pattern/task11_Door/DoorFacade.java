package hw_pattern.task11_Door;

public class DoorFacade {

    private DoorOpen doorOpen = new DoorOpen();
    private DoorClose doorClose = new DoorClose();
    private DoorLock doorLock = new DoorLock();

    public void controlTheDoor(){
        doorOpen.open();
        doorClose.close();
        doorLock.lock();
    }
}
