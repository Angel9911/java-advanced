package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task3_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        set.add(2);
        set.add(2);

        list.add(3);
        list.add(3);
        // the main difference between set and list is that list could be store duplicate elements in difference of Set
        // that  could be store only unique elements.
        System.out.println(set);
        System.out.println(list);
    }
}
