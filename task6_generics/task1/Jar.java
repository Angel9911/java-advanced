package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task6_generics.task1;

import java.util.ArrayDeque;

public class Jar<T> {
    private final ArrayDeque<T> stack;

    public void add(T element){
        this.stack.push(element);
    }

    public Jar() {
        this.stack = new ArrayDeque<>();
    }

    public T remove(){
        return this.stack.pop();
    }

    @Override
    public String toString() {
        return "Jar{" +
                "stack=" + stack +
                '}';
    }
}
