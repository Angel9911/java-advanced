package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task6_generics.task5;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(16);
        list.add(22);
        list.add(32);
        list.add(18);

        System.out.println(ListUtils.getMax(list));
        System.out.println(ListUtils.getMin(list));
    }
}
