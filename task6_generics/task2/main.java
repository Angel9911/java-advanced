package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task6_generics.task2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        String[] getStringArray = (String[]) ArrayCreator.<String>create(5,"Acho");
        Integer[] getIntegerArray = ArrayCreator.<Integer>create(Integer.class,5,23);

        System.out.println("String array:");
        Arrays.stream(getStringArray).forEach((item) -> System.out.printf(" %s ",item));

        System.out.println("Integer array:");
        Arrays.stream(getIntegerArray).forEach((item)-> System.out.printf(" %s ",item));
    }
}
