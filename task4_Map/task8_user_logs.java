package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task4_Map;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class task8_user_logs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String,Integer>> userData = new TreeMap<>();
        LinkedHashMap<String,Integer> currentIp;

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] inputParts = input.split("\\s+");

            String ipAddress = inputParts[0].split("=")[1];
            String message = inputParts[1].split("=")[1];
            String username = inputParts[2].split("=")[1];

            if(!userData.containsKey(username)){
                userData.put(username,new LinkedHashMap<>(){{
                    put(ipAddress,1);
                }});
            }else{

                currentIp = userData.get(username);
                if(currentIp.containsKey(ipAddress)){

                    int currentVisited = currentIp.get(ipAddress);

                    currentIp.put(ipAddress,currentVisited+1);

                }else {

                    currentIp.put(ipAddress,1);
                }
                userData.put(username,currentIp);
            }


            input = scanner.nextLine();
        }

        AtomicInteger count = new AtomicInteger();

        //softuni way to display records
        userData.keySet()
                .forEach(username -> {
                    System.out.println(username);

                    LinkedHashMap<String,Integer>getIpAddresses = userData.get(username);
                    count.set(0);

                    getIpAddresses.entrySet()
                            .stream()
                            .forEach(ip -> {

                                count.getAndIncrement();
                                if(count.get()==getIpAddresses.size()) {
                                    System.out.println(ip.getKey() + " => " + ip.getValue() + ".");
                                }else {
                                    System.out.println(ip.getKey() + " => " + ip.getValue() + ", ");
                                }
                            });
                });


        // my approach
        userData.entrySet()
                .forEach(entrySet ->{
                    String getUsername = entrySet.getKey();
                    LinkedHashMap<String,Integer> getIpAddresses = entrySet.getValue();

                    System.out.println(getUsername);
                    getIpAddresses.entrySet().forEach(ipAddress ->{
                        System.out.println(String.format(" %s => %d",ipAddress.getKey(),ipAddress.getValue()));
                    });
                });
    }
}
