public class PriorityQueue implements QueueInterface{
    private String[] data;
    private int currentSize;

    public PriorityQueue(int size) {
        this.currentSize = 0;
        this.data = new String[size];
    }

    @Override
    public String removeFirst() {
        return data[--currentSize];
    }

    @Override
    public void insert(String value) {
        if (currentSize == 0) {
            data[currentSize++] = value;
        }
        else {
            int i;
            for ( i = currentSize - 1; i >= 0; i--) {
                if (value.compareTo(data[i]) > 0) {
                    data[i + 1] = data[i];
                }
                else {
                    break;
                }
            }
            data[i + 1] = value;
            currentSize++;
        }
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean isFull() {
        return currentSize == data.length;
    }
}
