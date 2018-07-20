/**
 * Algorithms and Data Structures, Homework 2
 * @author Aleksey Petrenko
 * @version July 12, 2018
 * @link https://github.com/AlexTheLion34
 */

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ArrayMain {

    public static void main(String[] args) {
        LiteArrayList la = new LiteArrayList(100000);
        Random random = new Random();
        for (int i = 0; i < la.getCapasity(); i++) {
            la.addElement(random.nextInt(100000));
        }

        LiteArrayList la2 = new LiteArrayList(la);
        LiteArrayList la3 = new LiteArrayList(la);
        LiteArrayList la4 = new LiteArrayList(la);

        long start, finish;
        start = System.nanoTime();
        la2.bubbleSort();
        finish = System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(finish - start));
        start = System.nanoTime();
        la3.insertSort();
        finish = System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(finish - start));
        start = System.nanoTime();
        la4.selectSort();
        finish = System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(finish - start));
    }


    //меняет 2 елемента местами
    static void swap(int[] item, int leftIndex, int rightIndex){
        if(leftIndex != rightIndex) {
            int t = item[leftIndex];
            item[leftIndex] = item[rightIndex];
            item[rightIndex] = t;
        }
    }
}
