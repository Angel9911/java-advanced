package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.comparable_and_comparatros.task2;

import java.util.ArrayList;
import java.util.List;

public class task2_Book_comparator {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("test1", 2002, "Test Testov");
        LibraryBook book2 = new LibraryBook("test1", 1999, "Pesho Peshov");
        LibraryBook book3 = new LibraryBook("test3", 2001, "Mario Mandjukov");
        LibraryBook book4 = new LibraryBook("test4", 2005, "Ivan Ivanov");

        LibraryBookTitleComparator titleComparator = new LibraryBookTitleComparator();

        LibraryBookYearComparator yearComparator = new LibraryBookYearComparator();

        List<LibraryBook> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        books.sort(titleComparator);

        System.out.println("sort by title,if they are equal then sort by year");
        books.forEach(System.out::println);

        books.sort(yearComparator);

        System.out.println("sort by year,if they are equal then sort by title");
        books.forEach(System.out::println);
    }
}
