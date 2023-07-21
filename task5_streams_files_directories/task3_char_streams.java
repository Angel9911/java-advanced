package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task5_streams_files_directories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task3_char_streams {
    public static void main(String[] args) {
        String readFile = "";
        String fileNumbers = "";

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
