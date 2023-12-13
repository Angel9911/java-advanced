package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank.strings;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        // https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
        Scanner scanner = new Scanner(System.in);

        String readInput = scanner.nextLine();
        int countEquals = 0;

        if(!readInput.isEmpty() && readInput.length()<=50){

            for(int i=0;i<readInput.length()/2;i++){

                char getLetter = readInput.charAt(i);

                char getLastLetter = readInput.charAt(readInput.length()-1-i);

                if(getLetter == getLastLetter){
                    countEquals++;
                }
            }

            if(countEquals == readInput.length()/2){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
    }
}
