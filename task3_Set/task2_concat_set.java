package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task3_Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class task2_concat_set {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = 0;

        int sizeFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondSset = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        for(int i=1; i <= sizeFirstSet; i++){
            number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for(int i=1; i <= sizeSecondSset; i++){
            number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        Set<Integer> duplicateElements = new LinkedHashSet<>();
        for(Integer element:firstSet){
            if(secondSet.contains(element)){
                duplicateElements.add(element);
            }
        }

        System.out.println("The duplicate elements of two sets are: ");
        duplicateElements.forEach(element -> System.out.println(element + "  "));

       /* System.out.println(firstSet.stream()
                .filter(element -> secondSet.contains(element))
                .collect(Collectors.toList())); - it is working*/

        // second way to achieve this
        firstSet.retainAll(secondSet);
        System.out.println("The duplicate elements of two sets are(Second Way): ");
        System.out.println(firstSet);
    }
}
