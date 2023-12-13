package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.iterable_iterators.task2;

import interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.iterable_iterators.Book;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private final Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private class LibIterator implements Iterator<Book>{
        private int count;

        public LibIterator() {
            this.count = 0;
        }

        @Override
        public boolean hasNext() {
            return count < books.length;
        }

        @Override
        public Book next() {
            return books[count++];
        }
    }
}
