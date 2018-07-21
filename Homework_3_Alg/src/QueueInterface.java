public interface QueueInterface {
    String removeFirst();
    void insert(String value);
    boolean isFull();
    boolean isEmpty();
}
