package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task7_set_map_labs.map;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Double>> studentsGrade = new TreeMap<>();

        int studentCount = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<studentCount;i++){

            String[] readStudent = scanner.nextLine().split("\\s+");

            String studentName = readStudent[0];
            String grade = readStudent[1];

            double toDoubleGrade = Double.parseDouble(grade);


            if(studentsGrade.containsKey(studentName)){

                ArrayList<Double> currentGrades = studentsGrade.get(studentName);
                currentGrades.add(toDoubleGrade);

                studentsGrade.put(studentName,currentGrades);
            }else{
                ArrayList<Double> grades = new ArrayList<>();
                grades.add(toDoubleGrade);

                studentsGrade.put(studentName,grades);
            }
        }

        studentsGrade.forEach((student,grades) -> {
            StringBuilder append = new StringBuilder();
            for (double getGrade:grades) {
                append.append(getGrade).append(" ");
            }
            System.out.printf(" %s -> %s (%.2f)", student, append, getAverageGrade(grades));
        });
    }

    private static double getAverageGrade(ArrayList<Double> grades){

        double sumGrades = grades.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        return sumGrades/grades.size();
    }
}
