package hw7_generics_exceptions.generics.task1.extra_hw.task1;

public class Storage <T>{

    private T item;

    public Storage(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}
