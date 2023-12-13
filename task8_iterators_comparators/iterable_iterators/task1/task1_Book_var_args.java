package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.iterable_iterators.task1;


import interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.iterable_iterators.Book;

public class task1_Book_var_args {
    public static void main(String[] args) {

        Book book1 = new Book("test", 2002, "Pesho");
        Book book2 = new Book("test2", 2002, "Anna", "Mitko");
        Book book3 = new Book("test3", 2002);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
