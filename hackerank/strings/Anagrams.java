package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank.strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

        String firstWord = scanner.nextLine();
        if(scanner.hasNextLine()){
            String secondWord = scanner.nextLine();

            System.out.println(isAnagram(firstWord.toLowerCase(Locale.ROOT), secondWord.toLowerCase(Locale.ROOT)));
        }
        scanner.close();
    }
    private static String isAnagram(String first, String second){
        char[] firstWordLetters = first.toCharArray();

        char[] secondWordLetters = second.toCharArray();

        Arrays.sort(firstWordLetters);
        Arrays.sort(secondWordLetters);

        String sortedFirstWord = Arrays.toString(firstWordLetters);
        String sortedSecondWord = Arrays.toString(secondWordLetters);

        if(!sortedFirstWord.equals(sortedSecondWord)){
            return "Not Anagrams";
        }

        return "Anagrams";
    }
}
