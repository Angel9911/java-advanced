package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task2_queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> queuePrint = new ArrayDeque<>();

        try {
            while (!input.equals("print")) {

                if (input.equals("cancel")) {
                    if (!queuePrint.isEmpty()) {

                        String documentToRemove = queuePrint.remove();
                        System.out.println("Canceled " + documentToRemove);
                    } else {

                        System.out.println("The printer is on standby");
                    }
                } else {
                    queuePrint.add(input);
                }
                input = scanner.nextLine();
            }
        }catch (NoSuchElementException exception){
            System.out.println("The exception is " + exception);
        }
        queuePrint.forEach(System.out::println);
    }
}
