package hw5_opp.museum_task8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Exhibit manuscript = new Manuscript();
        museum.setExhibit(manuscript);
        museum.showExhibit(manuscript);

        Exhibit sculpture = new Sculpture();
        museum.setExhibit(sculpture);
        museum.showExhibit(sculpture);
    }
}
