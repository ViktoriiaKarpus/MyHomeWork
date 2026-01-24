package hw_dry_kiss_yagni_solid.task7;

public class Programmer implements Worker {
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }

    // We should not use this method , because we don't use it. Am I right?
    //  @Override
    //  public void eat(){
    //      System.out.println("Программист не ест на работе");
    //  }
}
