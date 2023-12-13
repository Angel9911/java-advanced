package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

        String[] readString = scanner.nextLine().split("[\\s!,.?_@']+");

        String[] newString = Arrays.stream(readString)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        System.out.println(newString.length);

        for(String letter : newString){
            System.out.println(letter);
        }
    }
}
