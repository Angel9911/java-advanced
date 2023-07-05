package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task4_Map;

import java.util.*;

public class task6_fixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> userEmails = new HashMap<>();
        LinkedHashMap<String,String> inInputOrderEmails = new LinkedHashMap<>();
        TreeMap<String,String> ascendingOrderEmails = new TreeMap<>();

        String username = scanner.nextLine();
        String email = "";

        while (!username.equals("stop")){

            email = scanner.nextLine();

            if(!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")){
                userEmails.put(username,email);
                inInputOrderEmails.put(username,email);
                ascendingOrderEmails.put(username,email);
            }
            username = scanner.nextLine();
        }
        System.out.println("Map collection");
        userEmails.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        System.out.println("LinkedHashMap collection");
        inInputOrderEmails.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        System.out.println("TreeMap collection");
        ascendingOrderEmails.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        //userEmails.forEach((getUsername,getEmail) -> System.out.println(getUsername + " -> " + getEmail));
    }
}
