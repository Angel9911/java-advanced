package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task7_set_map_labs.set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> invitedGuests = new TreeSet<>();

        String guest = scanner.nextLine();

        while(!guest.equals("PARTY")){
            invitedGuests.add(guest);
            guest = scanner.nextLine();
        }

        guest = scanner.nextLine();

        while(!guest.equals("END")){
            invitedGuests.remove(guest);
            guest = scanner.nextLine();
        }



        invitedGuests.forEach(System.out::println);
    }
}
