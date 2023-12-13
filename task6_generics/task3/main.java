package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task6_generics.task3;

public class main {
    public static void main(String[] args) {

        ZooKeeper<Dog> zooKeeperDog = new ZooKeeper<>();
        ZooKeeper<Cat> zooKeeperCat = new ZooKeeper<>();
        zooKeeperCat.sleepAllAnimals();
    }
}
