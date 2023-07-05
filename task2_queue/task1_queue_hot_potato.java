package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task2_queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class task1_queue_hot_potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        int numOfTurns = 0;
        try {

            String[] children = scanner.nextLine().split("\\s+");
            numOfTurns = Integer.parseInt(scanner.nextLine());
            queue = new ArrayDeque<>();
            for (int i = 0; i < children.length; i++) {
                queue.add(children[i]);
            }
            System.out.println(queue);
        }catch (NoSuchElementException | NumberFormatException noSuchElementException){
            System.out.println(noSuchElementException.getMessage());
        }

        while (queue.size() !=  1){

            for (int i=1; i < numOfTurns; i++) {
                String currentChild = queue.poll();
                queue.add(currentChild);
            }
            String childToRemove = queue.poll();
            System.out.println("Removed Child: " + childToRemove);
        }
        System.out.println("Left " + queue.peek());
    }
}
