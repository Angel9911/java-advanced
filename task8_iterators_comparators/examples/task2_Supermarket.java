package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.examples;

import java.util.Iterator;

public class task2_Supermarket {
    public static void main(String[] args) {
        Shop shop = new Shop("banana", "parsley", "dill", "celery", "broccoli", "garbage", "carrots");

        Iterator<String> iterator = shop.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
