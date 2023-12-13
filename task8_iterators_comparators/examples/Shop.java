package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Shop implements Iterable<String>{
    private List<String> fruits;

    public Shop(String... fruits) {

        this.setFruits(new ArrayList<>(Arrays.asList(fruits)));
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    @Override
    public Iterator<String> iterator() {
        return new ShopAssistant();
    }

    private class ShopAssistant implements Iterator<String> {
        private int index;

        public ShopAssistant() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < fruits.size();
        }

        @Override
        public String next() {
            return fruits.get(index++);
        }
    }
}
