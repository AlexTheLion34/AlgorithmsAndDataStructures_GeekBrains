public class Homework_8_Alg {

    public static void main(String[] args) {

        ChainHashTable hashTable = new ChainHashTable(5);

        Item item1 = new Item("Арбуз", 26);
        Item item2 = new Item("Дыня", 36);
        Item item3 = new Item("Банан", 18);

        hashTable.add(item1);
        hashTable.add(item2);
        hashTable.add(item3);

        System.out.println("После вставки:");
        hashTable.display();
        System.out.println("После удаления:");
        hashTable.remove(item1);
        hashTable.display();
        System.out.println("Найти Банан: " + hashTable.find(item3.getId()));

        System.out.println("размер " + hashTable.getSize());
    }

}