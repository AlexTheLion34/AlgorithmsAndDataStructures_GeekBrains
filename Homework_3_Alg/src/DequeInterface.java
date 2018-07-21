public interface DequeInterface {
    boolean isEmpty();
    boolean isFull();
    void pushBack(String value);
    void pushFront(String value);
    String popBack();
    String popFront();
}
