package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task7_set_map_labs.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class WarNumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        Set<Integer> firstPlayer = new LinkedHashSet<>();

        String[] inputConsole = scanner.nextLine().split("\\s+");
        for (String number:inputConsole) {
            int getNumber = Integer.parseInt(number);
            firstPlayer.add(getNumber);
        }

        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && counter<50){

            int firstNum = firstPlayer.iterator().next();
            firstPlayer.remove(firstNum);

            int secondNum = secondPlayer.iterator().next();
            secondPlayer.remove(secondNum);

            if(firstNum>secondNum){

                firstPlayer.add(firstNum);
                firstPlayer.add(secondNum);
            }else if(secondNum>firstNum){

                secondPlayer.add(firstNum);
                secondPlayer.add(secondNum);
            }
            counter++;
        }
        if(firstPlayer.size()>secondPlayer.size()){
            System.out.println("first player win");
        }else{
            System.out.println("second player win");
        }
    }
}
