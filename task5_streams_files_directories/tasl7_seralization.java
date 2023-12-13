package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task5_streams_files_directories;

import java.io.*;

public class tasl7_seralization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Serialization is used when we want to write an object into a file. And it's achieved when our object implement Serializable
        // interface and the object is written in such way that it could easily read.
        // It creates a file with .ser extension

        Cube cube = new Cube("red",2,2,2);
        Cube cube2 = new Cube("black",2,2,2);

        String path = "E:\\Programs\\SpringAngularProject\\angular7-springboot-crud-tutorial-master\\Interview-tasks\\src\\interview_tasks_paysafe\\object_oriented\\softuni\\java_advanced\\task5_streams_files_directories\\files\\Cube.ser";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(cube);
        objectOutputStream.writeObject(cube2);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));

        Cube readCube = (Cube) objectInputStream.readObject();
        System.out.println(readCube);// print the last object is written in the file, because when insert seconds object
        // it rewrites the file with the given object.

        objectOutputStream.close();

    }
}
