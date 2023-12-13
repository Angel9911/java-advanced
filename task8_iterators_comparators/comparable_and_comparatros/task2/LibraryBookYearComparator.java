package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.comparable_and_comparatros.task2;

import java.util.Comparator;

public class LibraryBookYearComparator implements Comparator<LibraryBook> {
    @Override
    public int compare(LibraryBook o1, LibraryBook o2) {
        int compareYear = Integer.compare(o1.getYear(), o2.getYear());

        if(compareYear == 0){
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return compareYear;
    }
}
