package hw5_opp.museum_task8;

public class Museum {
    public Exhibit exhibit;

    public void showExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Exhibit: " + exhibit.describe());
        exhibit.preserve();
    }

    public void setExhibit(Exhibit exhibit){
        this.exhibit=exhibit;
    }
}
