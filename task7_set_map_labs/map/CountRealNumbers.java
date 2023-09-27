package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task7_set_map_labs.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Double,Integer> countRealNum = new LinkedHashMap<>();

        String readInput = scanner.nextLine();
        System.out.println(readInput);

        String[] readNumbers = readInput.split(" ");

        for(String number: readNumbers){

            Double toDouble = Double.valueOf(number);

            if(countRealNum.containsKey(toDouble)){
                countRealNum.put(toDouble,countRealNum.get(toDouble)+1);
            }else{
                countRealNum.put(toDouble,1);
            }
        }

        countRealNum.forEach((realNum,count) ->{System.out.printf("%.1f -> %d%n",realNum,count);});
    }
}
