public class Deque implements DequeInterface {

    String[] data;
    int currentSize;
    int front;
    int rear;

    public Deque(int size) {
        data = new String[size];
        currentSize = 0;
        front = 0;
        rear = 0;
    }


    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean isFull() {
        return currentSize == data.length;
    }

    @Override
    public void pushBack(String value) {
        if(isFull()){
            throw new IllegalArgumentException("Is Full");
        }
        if(rear == data.length){
            rear = 0;
        }
        data[rear++] = value;
        currentSize++;
    }

    @Override
    public void pushFront(String value) {
        if(isFull()){
            throw new IllegalArgumentException("Is Full");
        }
        if(front == 0){
            front = data.length;
        }
        data[--front] = value;
        currentSize++;
    }

    @Override
    public String popBack() {
        if(isEmpty()){
            throw new IllegalArgumentException("Is Empty");
        }
        if(rear == 0){
            rear = data.length;
        }
        currentSize--;
        return data[--rear];
    }

    @Override
    public String popFront() {
        if(isEmpty()){
            throw new IllegalArgumentException("Is Empty");
        }
        if(front == data.length){
            front = 0;
        }
        currentSize--;
        return data[front++];

    }
}
