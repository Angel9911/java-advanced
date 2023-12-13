package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task6_generics.task1;

public class main {
    public static void main(String[] args) {
        Jar<String> jarString = new Jar();

        jarString.add("blue");
        jarString.add("black");
        jarString.add("red");

        System.out.println("remove cookie: " + jarString.remove());

        System.out.println("result: " + jarString.toString());

        Jar<Integer> integerJar = new Jar<>();
        integerJar.add(24);
        integerJar.add(26);
        integerJar.add(21);

        System.out.println("remove integer: " + integerJar.remove());

        System.out.println("result: " + integerJar.toString());

        //String jar extends Jar<T> class, but set type String in <>. In this way, the StringJar is already specific object.
        StringJar stringJar = new StringJar();
        stringJar.add("StringJar");
        stringJar.add("Jar");
        System.out.println("String jar extends Jar<T> class: " + stringJar.toString());
    }
}
