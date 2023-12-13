package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank.strings;

import java.util.*;
import java.util.regex.Pattern;

public class IPAddressRegex {

    public static void main(String[] args) {


        // https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
        Scanner scanner = new Scanner(System.in);

        List<String> ipAddresses = new ArrayList<>();

        String readInput;

        while(scanner.hasNextLine()){

            readInput = scanner.nextLine();

            if(!readInput.isEmpty()){
                ipAddresses.add(readInput);
            }else{
                break;
            }
        }
        isValidIpAddress(ipAddresses);
    }

    private static void isValidIpAddress(List<String> ipAddresses){

        String regexPattern = "^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$";

        for(String ipAddress : ipAddresses){

            boolean matches = Pattern.matches(regexPattern, ipAddress);
            if(!matches){
                System.out.println("false");
            }else{
                System.out.println("true");
            }
        }
    }
}
