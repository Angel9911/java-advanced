package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank;

import java.util.*;

public class ArrayListSearchElements {
    public static void main(String[] args) {

        // https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = null;
        Map<Integer,ArrayList<Integer>> rowsElements = new LinkedHashMap<>();

        int rows = scanner.nextInt();

        scanner.nextLine();

        for(int i=1;i<=rows;i++){

            String[] readRowElements = scanner.nextLine().split(" ");

            int countElements = Integer.parseInt(readRowElements[0]);

            numbers = new ArrayList<>();
            numbers.add(null);// to not start with index 0

            for(int j=1;j<=countElements;j++){

                numbers.add(Integer.parseInt(readRowElements[j]));

            }

            rowsElements.put(i,numbers);
        }

        Iterator<Integer> iterator = numbers.iterator();

        int rowsQuery = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<rowsQuery;i++){

            String[] readRowQuery = scanner.nextLine().split(" ");

            int rowNumber = Integer.parseInt(readRowQuery[0]);
            int indexNumber = Integer.parseInt(readRowQuery[1]);

            ArrayList<Integer> rowElements = rowsElements.get(rowNumber);

            try {

                Integer searchIndex = rowElements.get(indexNumber);
                System.out.println(searchIndex);
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR");
            }
        }
    }
}
