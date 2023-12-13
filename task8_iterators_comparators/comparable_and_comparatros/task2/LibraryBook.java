package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task8_iterators_comparators.comparable_and_comparatros.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryBook {
    private String title;
    private int year;
    private List<String> authors;

    public LibraryBook(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        //this.setAuthors(List.of(authors)); - its working
        this.setAuthors(new ArrayList<>(Arrays.asList(authors)));
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return String.format("Book: %s %d",this.getTitle(), this.getYear());
    }
}
