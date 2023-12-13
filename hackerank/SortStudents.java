package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{

    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        int compareGrade = Double.compare(o.getGrade(), this.grade);

        int compareName = this.name.compareTo(o.getName());

        int compareIds = Integer.compare(this.id, o.getId());

        if(compareGrade == 0){

            return compareName;
        } else if(compareName == 0){

            return compareIds;
        }

        return compareGrade;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class SortStudents {

    // https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countStudents = scanner.nextInt();

        scanner.nextLine();

        ArrayList<Student> students = new ArrayList<>();

        for(int i=0;i<countStudents;i++){

            String[] studentDetails = scanner.nextLine().split(" ");
            int studentId = Integer.parseInt(studentDetails[0]);

            String studentName = studentDetails[1];
            double grade = Double.parseDouble(studentDetails[2]);

            Student student = new Student(studentId,studentName,grade);

            students.add(student);
        }


        Collections.sort(students);

        students.forEach(System.out::println);

    }
}
