package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task6_generics.task3;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper<T extends Animal>{
    private List<T> animalList = new ArrayList<>();


    public void sleepAllAnimals(){
        for (T animal:animalList){
            animal.sleep();
        }
    }
}
