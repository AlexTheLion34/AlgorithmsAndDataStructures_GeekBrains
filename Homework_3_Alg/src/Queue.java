public class Queue implements QueueInterface {
    private String[] data;
    private int currentSize;

    private int front;
    private int rear;

    Queue(int size){
        currentSize = 0;
        data = new String[size];
        front = 0;
        rear = 0;
    }

    @Override
    public String removeFirst() {
        if(isEmpty()){
            throw new IllegalArgumentException("Очередь пуста");
        }
        if(front == data.length){
            front = 0;
        }
        currentSize--;
        return data[front++];
    }


    @Override
    public void insert(String value) {
        if(isFull()){
            throw new IllegalArgumentException("Очередь заполнена");
        }
        if(rear == data.length){
            rear = 0;
        }
        data[rear++] = value;
        currentSize++;
    }

    @Override
    public boolean isFull() {
        return currentSize == data.length;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }
}
