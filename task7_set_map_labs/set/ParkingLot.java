package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task7_set_map_labs.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> carsNumber = new HashSet<>();

        String inputConsole = scanner.nextLine();
        while (!inputConsole.equals("END")){
            String[] parts = inputConsole.split(", ");

            String command = parts[0].trim();
            String value = parts[1].trim();

            if(command.equals("IN")){

                carsNumber.add(value);
            }else if(command.equals("OUT")){

                carsNumber.remove(value);
            }
            inputConsole = scanner.nextLine();
        }
        if(!carsNumber.isEmpty()){

            carsNumber.forEach(System.out::println);
        }else{

            System.out.println("Parking lot is empty");
        }

    }
}
