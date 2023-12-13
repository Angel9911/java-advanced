package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {

        // the task is https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> phoneBook = new LinkedHashMap<>();

        Set<String> namesChecking = new LinkedHashSet<>();

        int n = scanner.nextInt();

        scanner.nextLine();

        for(int i=0;i<n;i++){

            String name = scanner.nextLine();

            int phone = scanner.nextInt();

            scanner.nextLine();

            if(name.isEmpty()){

               System.out.println("name must not be empty");
               break;
            }else if(String.valueOf(phone).length() != 8){

                System.out.println("The phone must be with 8 digits length");
                break;
            }else{

                phoneBook.put(name,phone);
            }

        }

        //System.out.println("Input these names which you want to search it");

        while(scanner.hasNextLine()){

            String searchingName = scanner.nextLine();

            if(!searchingName.isEmpty()){
                namesChecking.add(searchingName);
            }else{
                break;
            }
        }

        phoneBook.forEach((name,phone)->{
            if(namesChecking.contains(name)){
                System.out.println(name + " = "+phone);
            }else{
                System.out.println("Not found");
            }
        });
    }
}
