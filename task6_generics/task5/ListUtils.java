package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task6_generics.task5;

import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static<T extends Comparable<T>> T getMax(List<T>list){

        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
        return Collections.max(list);

    }
    public static<T extends Comparable<T>> T getMin(List<T>list){

        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
        T getCurrentMin = list.get(0);
        for(int i=1;i<list.size();i++){
            T currentElement = list.get(i);
            if(getCurrentMin.compareTo(currentElement) > 0){
                getCurrentMin = currentElement;
            }
        }
        return getCurrentMin;
    }
}
