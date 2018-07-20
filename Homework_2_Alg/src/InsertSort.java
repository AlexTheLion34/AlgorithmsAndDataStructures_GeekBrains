public class InsertSort {
    public static void sort(int[] item){
        int sortedSize = 1;
        while (sortedSize != item.length){
            if(item[sortedSize] < item[sortedSize - 1]){
                insertIndex(item, sortedSize, sortedSize);
            }
            sortedSize++;
        }
    }

    private static void insertIndex(int[] item, int sortedSize, int index) {
        metka:
        {
            for (int i = 0; i < sortedSize; i++) {
                if (item[index] < item[i]) {
                    insert(item, sortedSize, i, index);
                    return;
                }
            }
        }
    }
    private static void insert(int[] item, int sortedSize, int destIndex, int srcIndex){
        int t = item[srcIndex];
        for(int i = sortedSize - 1; i >= destIndex; i--){
            item[i + 1] = item[i];
        }
        item[destIndex] = t;
    }
}
