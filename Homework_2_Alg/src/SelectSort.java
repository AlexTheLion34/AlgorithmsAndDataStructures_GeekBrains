public class SelectSort {
    public static void sort(int [] item){
        for (int i = 0; i < item.length; i++) {
            for (int j = i + 1; j < item.length; j++){
                if (item[j] < item[i]){
                    ArrayMain.swap(item, i, j);
                }
            }
        }
    }
}
