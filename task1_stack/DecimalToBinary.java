package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task1_stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // my solution
       /* ArrayDeque<Integer> binrary = new ArrayDeque<>();
        int inputDecimal = Integer.parseInt(scanner.nextLine());
        while (inputDecimal != 0) {

            if (inputDecimal % 2 != 0) {
                binrary.push(1);
            } else {
                binrary.push(0);
            }
            inputDecimal = inputDecimal / 2;
        }
        System.out.println(binrary); */
        // end of my solution


        //softuni solution

        ArrayDeque<Integer> binraryStack = new ArrayDeque<>();
        int input = Integer.parseInt(scanner.nextLine());

        while (input != 0) {

            int leftOver = input % 2;

            binraryStack.push(leftOver);

            input = input/2;
        }
        // or use foreach to print stack values without delete each element
        for (Integer elem:binraryStack) {
            System.out.println(elem);
        }

        while (!binraryStack.isEmpty()){

            System.out.print(binraryStack.pop());
        }
    }
}
