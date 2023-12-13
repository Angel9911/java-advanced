package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAddDeleteOperations {
    public static void main(String[] args) {

        // https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true

        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>();

        int countNumbers = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<countNumbers;i++){

            int readNumber = scanner.nextInt();
            integerList.add(readNumber);
        }

        scanner.nextLine();

        int countOperations = scanner.nextInt();

        scanner.nextLine();
        for(int i=0;i<countOperations;i++){

            String command = scanner.nextLine();

            switch (command) {
                case "Insert" -> {
                    String[] readNumber = scanner.nextLine().split(" ");
                    String index = readNumber[0];
                    String number = readNumber[1];
                    integerList.add(Integer.parseInt(index), Integer.parseInt(number));
                }
                case "Delete" -> {
                    String deleteNumInIndex = scanner.nextLine();
                    integerList.remove(Integer.parseInt(deleteNumInIndex));
                }
            }
        }
        integerList.forEach(elem -> System.out.print(elem+" "));
    }
}
