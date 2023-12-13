package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task5_streams_files_directories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task3_char_streams {
    public static void main(String[] args) {
        String readFile = "E:\\Programs\\SpringAngularProject\\angular7-springboot-crud-tutorial-master\\Interview-tasks\\src\\interview_tasks_paysafe\\object_oriented\\softuni\\java_advanced\\task5_streams_files_directories\\files\\task3_char_streams";
        String fileNumbers = "E:\\Programs\\SpringAngularProject\\angular7-springboot-crud-tutorial-master\\Interview-tasks\\src\\interview_tasks_paysafe\\object_oriented\\softuni\\java_advanced\\task5_streams_files_directories\\files\\task3_extract_numbers";

        // FileRead and FileWrite are char streams
        // The main difference between char stream and byte streams(FileInput/OutputStream) is that the first stream
        // read file char by char and the second stream read file byte by byte

        Scanner scanner = null;
        PrintWriter writeFile = null;

        try {

             scanner = new Scanner(new FileInputStream(readFile));
             writeFile = new PrintWriter(new FileOutputStream((fileNumbers)));

             while(scanner.hasNext()){

                 if(scanner.hasNextInt()){

                     int myNum = scanner.nextInt();
                     writeFile.print(myNum + " ");
                 }
                 scanner.next();
             }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
            writeFile.close();
        }
    }
}
