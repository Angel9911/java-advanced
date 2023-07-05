package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task1_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class task_1_stack_calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String> stack = new ArrayDeque<>();
       // start of my solution of the first task
        int calculatePlus = 0;
        int calculateMinus = 0;
        int getNumber = 0;

        String[] input = bufferedReader.readLine().split("\\s+");
        for (String number:input) {
            stack.push(number);
        }

        while (!stack.isEmpty()){
            String n = stack.peek();
            if(n.equals("+")){
                 calculatePlus = calculatePlus + getNumber;
                 getNumber = 0;
            } else if(n.equals("-")){
                 calculateMinus = calculateMinus - getNumber;
                getNumber = 0;
             } else{
                 getNumber = Integer.parseInt(n);

             }
            stack.pop();
        }
        System.out.println(calculatePlus + calculateMinus + getNumber);
        // end of my solution


        // softuni solution
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        String[] inputNum = scanner.nextLine().split(" ");
        ArrayDeque<String> tokens = new ArrayDeque<>();

        Collections.addAll(tokens,inputNum); // the first element in the array will be the last element in stack

        while(tokens.size() > 1){
            int firstNum = Integer.parseInt(tokens.pop());
            String operator = tokens.pop();
            int secondNum = Integer.parseInt(tokens.pop());

            if(operator.equals("+")){
                result = firstNum + secondNum;
            } else {
                result = firstNum - secondNum;
            }
            tokens.push(String.valueOf(result));
        }
        System.out.println(tokens.peek());
    }
}

