package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.iterable_iterators.task2;

import interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.iterable_iterators.Book;

import java.util.Iterator;

public class task2_Book_library_iterator {
    public static void main(String[] args) {

        Book book1 = new Book("test", 2002, "Pesho");
        Book book2 = new Book("test2", 2002, "Anna", "Mitko");
        Book book3 = new Book("test3", 2002);

        Library library = new Library(book1,book2,book3);

        Iterator<Book> iterator = library.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
