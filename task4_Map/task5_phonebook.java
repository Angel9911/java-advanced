package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task4_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class task5_phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> phoneBook = new HashMap<>();

        try {
            String input = scanner.nextLine();
            while (!input.equals("search")) {

                String[] userData = input.split("-");
                if (!phoneBook.containsValue(userData[1])) {

                    phoneBook.put(userData[0], userData[1]);
                } else {
                    System.out.println("the phone is already exists");
                }
                input = scanner.nextLine();
            }
        }catch (ArrayIndexOutOfBoundsException | PatternSyntaxException exception){
            System.out.println("The operator isn't correct or the string doesn't pass through pattern " + exception.getMessage());
            return;
    }

        String searchName = scanner.nextLine();
        while (!searchName.equals("stop")){

            if(phoneBook.containsKey(searchName)){
                System.out.println(searchName + " -> " + phoneBook.get(searchName));
            }else{
                System.out.printf(" %s doesn't exists",searchName);
            }
            searchName = scanner.nextLine();
        }
        System.out.println(" The phonebook consists of the following records");
        phoneBook.forEach((username,phone) -> System.out.println(username + " -> "+phone));
    }
}
