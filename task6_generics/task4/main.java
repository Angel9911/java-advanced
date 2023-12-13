package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task6_generics.task4;

public class main {
    public static void main(String[] args) {

        Scale<String> stringScale = new Scale<>("12","11");

        System.out.println(stringScale.getHeavier());

        Scale<Integer>integerScale = new Scale<>(22,33);

        System.out.println(integerScale.getHeavier());

        Scale<Double>doubleScale = new Scale<>(22.5,11.5);

        System.out.println(doubleScale.getHeavier());
    }
}
