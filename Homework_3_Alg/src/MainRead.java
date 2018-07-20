/**
 * Algorithms and Data Structures, Homework 3
 * @author Aleksey Petrenko
 * @version July 20, 2018
 * @link https://github.com/AlexTheLion34
 */

public class MainRead {

    public static void main(String[] args){
        String str = "Ароза упала на лапу Азора";
        printViceVersa(str);
    }

    public static void printViceVersa(String str){
        StackInterface stack = new Stack(50);
        for (char s: str.toCharArray()) {
            stack.push(String.valueOf(s));
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
