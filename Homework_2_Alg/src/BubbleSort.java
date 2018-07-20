public class BubbleSort {
    public static void sort(int [] item){
        boolean wasSwaped = true;
        while(wasSwaped) {
            wasSwaped = false;
            for (int i = 1; i < item.length; i++) {
                if (item[i] < item[i - 1]) {
                    wasSwaped = true;
                    ArrayMain.swap(item, i, i - 1);
                }
            }
        }
    }
}
