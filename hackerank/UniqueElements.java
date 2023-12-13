package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank;

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true

        ArrayList<Integer> numberUniqueElem = new ArrayList<>();

        Set<String> namesList = new HashSet<>();

        int n = scanner.nextInt();

        scanner.nextLine();

        int unique = 0;

        for (int i=0;i<n;i++){

            String name = scanner.nextLine();

            if(namesList.add(name)){
                unique++;
            }

            numberUniqueElem.add(unique);
        }
        numberUniqueElem.forEach(System.out::println);
    }
}
