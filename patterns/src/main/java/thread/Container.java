package thread;


public class Container {
    private boolean empty = true;
    private int value;

    public boolean isEmpty() {
        return empty;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
