package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task6_generics.task2;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T> T[] create(int length, T item){
        T[] createArray = (T[]) Array.newInstance(item.getClass(),length);
        for(int i=0;i<length;i++){
            createArray[i]=item;
        }
        return createArray;
    }

    public static<T> T[] create(Class<T>classType,int length,T item){

        T[] createArray = (T[])Array.newInstance(classType,length);

         for(int i=0;i<length;i++){

             createArray[i]=item;
         }
         return createArray;
    }
}
