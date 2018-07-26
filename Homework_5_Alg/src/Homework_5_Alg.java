/**
 * Algorithms and Data Structures, Homework 5
 * @author Aleksey Petrenko
 * @version July 26, 2018
 * @link https://github.com/AlexTheLion34
 */

public class Homework_5_Alg {

    public static void main(String[] args) {

        // Тесты возведения в степень
        System.out.println(" 2 ^ 5 == " + power(2, 5));
        System.out.println(" 3 ^ 0 == " + power(3,0));
        System.out.println(" 4 ^ 1 == " + power(4, 1));
        System.out.println("-5 ^ 2 == " + power(-5,2));
        System.out.println("-4 ^ 3 == " + power(-4, 3));
        System.out.println(" 2 ^ -1 == " + power(2, -1));
        System.out.println(" 2 ^ -3 == " + power(2, -3));

        // Тесты задачи про рюкзак
        Item[] arrayOfItems = {new Item(894, 8), new Item(260, 6), new Item(392, 4)};
        Rucksack rucksack = new Rucksack(arrayOfItems);
        int weightCapacity = 15; // задаем вместимость рюкзака
        System.out.println(rucksack.findBestSum(arrayOfItems.length - 1, weightCapacity));

    }

    private static double power(double value, int pow) {
        if (value == 0 && pow == 0) {
            throw new ArithmeticException("Неопределенность");
        }
        if (pow < 0) {
            if (pow == -1) return 1 / value;
            return 1 / value * power(value, ++pow);
        } else if (pow == 0) {
            return 1;
        } else if (pow == 1) {
            return value;
        } else {
            return value * power(value, --pow);
        }
    }
}
