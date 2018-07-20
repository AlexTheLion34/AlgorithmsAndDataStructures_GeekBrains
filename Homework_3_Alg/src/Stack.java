public class Stack implements StackInterface{
    private String[] data;
    private int currentSize;

    Stack(int size) {
        data = new String[size];
        currentSize = 0;
    }

    @Override
    public String pop() {
        try {
            return data[--currentSize];
        }catch (IndexOutOfBoundsException e){
            throw new IllegalArgumentException("Стек пуст");
        }
    }

    @Override
    public String peek() {
        return data[currentSize-1];
    }

    @Override
    public void push(String value) {
        try {
            data[currentSize++] = value;
        }catch (IndexOutOfBoundsException e){
            throw new IllegalArgumentException("Стек полон");
        }
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
