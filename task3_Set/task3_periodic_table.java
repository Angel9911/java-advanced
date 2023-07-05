package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task3_Set;

import java.util.*;

public class task3_periodic_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberRows= Integer.parseInt(scanner.nextLine());
        TreeSet<String> periodTable = new TreeSet<>();
        for(int i=0;i<numberRows;i++){
            String[]elements = scanner.nextLine().split("\\s+");
            for(String element: elements){
                periodTable.add(element);
            }
            //periodTable.addAll(Arrays.asList(elements));
            //or we can replace this for cycle with Collections.addAll(Arrays.asList(elements),periodTable);
        }
        periodTable.forEach(element -> System.out.print(element + " "));
    }

}
