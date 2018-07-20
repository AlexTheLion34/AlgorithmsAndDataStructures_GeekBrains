public class LiteArrayList {
    private int[] data;
    private int capasity; //на сколько элементов выделено памяти
    private int size; //сколько элементов добавлено

    //геттеры
    public int getSize() { return size; }
    public int getCapasity() { return capasity; }


    //конструкторы
    public LiteArrayList(int capasity) {
        this.capasity = capasity;
        data = new int[capasity];
        size = 0;
    }
    public LiteArrayList(LiteArrayList la){
        this.data = new int[la.capasity];
        this.size = la.size;
        this.capasity = la.capasity;
        for(int i = 0; i < this.size; i++){
            this.data[i] = la.data[i];
        }
    }
    //по умолчанию выделяется память на 10 элементов
    public LiteArrayList() { this(10); }


    //служебные методы
    //сдвигает елемент массива влево на один
    private void moveElementsToBegining(int indexStartingWith){
        for (int i = indexStartingWith; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size-1] = 0;
    }


    //методы для работы с классом
    //добавляет элемент в конец
    public void addElement(int value) throws  IllegalAccessError{
        if (size == capasity){
            throw new IllegalAccessError();
        }
        data[size++] = value;
    }
    public int getElement(int i) {
        return data[i];
    }
    //удаляет элемент и сдвигает массив
    public void deleteElement(int value){
        for (int i = 0; i < size; i++) {
            if (data[i] == value){
                moveElementsToBegining(i--);
                size--;
            }
        }
    }
    //возвращает индекс первого найденого элемента, в противном случае возвращает -1
    public int find(int value){
        for (int i = 0; i < size; i++){
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }


    //сортировки
    public void bubbleSort(){ BubbleSort.sort(data); }
    public void insertSort(){ InsertSort.sort(data); }
    public void selectSort(){ SelectSort.sort(data); }



    @Override
    public String toString() {
        String str = "[";
        for(int i = 0; i < size; i++){
            str += data[i] + " ";
        }
        str += "]";
        return "LiteArrayList{" +
                "data=" + str +
                ", capasity=" + capasity +
                ", size=" + size +
                '}';
    }
}
