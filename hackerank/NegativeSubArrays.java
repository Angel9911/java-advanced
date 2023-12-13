package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank;

import java.util.ArrayList;
import java.util.Scanner;

public class NegativeSubArrays {
    public static void main(String[] args) {

        // https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

        Scanner scanner = new Scanner(System.in);

        int countNumbers = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0;i<countNumbers;i++){
            int num = scanner.nextInt();
            numbers.add(num);
        }

        scanner.nextLine();

        int countNegative = 0;

        // first pass of the array - get only count of negative numbers
        long getNegativeNumbersCount = numbers.stream().filter(num -> num < 0).mapToInt(num -> num).count();

        // second pass of the array
        for(int i=1;i<numbers.size();i++){

            int getCurrentNum = numbers.get(i);
            int getPreviousNum = numbers.get(i-1);

            if((getCurrentNum+getPreviousNum)<0){
                countNegative++;
            }
        }

        // third pass of the array
        for(int i=2;i<numbers.size();i++){

            int sumNum = 0;
            for(int j=i-2;j<=i;j++){
                sumNum+=numbers.get(j);
            }

            if(sumNum<0){
                countNegative++;
            }
        }

        // fourth pass of the array
        for(int i=3;i<numbers.size();i++){

            int sumNum = 0;

            for(int j=i-3;j<=i;j++){
                sumNum+=numbers.get(j);
            }

            if(sumNum<0){
                countNegative++;
            }
        }

        // fifth pass of the array - sum all numbers and check if the sum is less than 0
        int sumNumbers = numbers.stream().mapToInt(num -> num).sum();

        if(sumNumbers < 0){

            countNegative++;
        }
        System.out.println(countNegative+getNegativeNumbersCount);
    }
}
