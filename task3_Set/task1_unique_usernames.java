package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task3_Set;

import java.util.*;
import java.util.stream.Collectors;

public class task1_unique_usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int usernameNumbers = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new HashSet<>();
        Set<String> linkedUsernames = new LinkedHashSet<>();
        TreeSet<String> treeUsernames = new TreeSet<>();

        for(int i=0;i<usernameNumbers;i++){

            String username = scanner.nextLine();

            usernames.add(username);
            linkedUsernames.add(username);
            treeUsernames.add(username);
        }

        // the difference between LinkedHashSet and Set, that LinkedHashSet arranged the records in the order that is entered, unlike Set
        // that arranged in random order
        // And TreeSet sorts the records lexigraphically in the acsending order

        System.out.println(usernames.stream()
                .filter(m -> !m.equals("dancho"))
                .collect(Collectors.toList()));

        System.out.println("Set collection: ");
        usernames.forEach(System.out::println);

        System.out.println("LinkedSet collection: ");
        linkedUsernames.forEach(System.out::println);

        System.out.println("TreeSet collection: ");
        treeUsernames.forEach(System.out::println);
    }
}
