package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank;

import java.util.ArrayList;

public class PrintArrayGenerics {
    public static void main(String[] args) {

        // https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Hello");
        stringArrayList.add("World");

        printArray(integerArrayList);
        printArray(stringArrayList);
    }

    private static <E> void printArray(ArrayList<E> elements){

        for (E e: elements){
            System.out.println(e);
        }
    }
}
