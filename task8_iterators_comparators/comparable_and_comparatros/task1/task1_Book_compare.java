package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.comparable_and_comparatros.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task1_Book_compare {
    public static void main(String[] args) {

        Book book1 = new Book("test1", 2002, "Test Testov");
        Book book2 = new Book("test1", 1999, "Pesho Peshov");
        Book book3 = new Book("test3", 2001, "Mario Mandjukov");

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books);

        System.out.println(books);
    }
}
