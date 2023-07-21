package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task5_streams_files_directories;

import java.io.*;
import java.util.Scanner;

public class task4_buffered_streams {
    public static void main(String[] args) throws IOException {

        String readFile = "";
        String writeFile = "";

        Scanner scanner = null;
        PrintWriter printWriter = null;

        BufferedReader bufferedReader = null;

        BufferedWriter bufferedWriter = null;
        int counter = 1;
        long startScan = 0L;
        long endcSan = 0L;

        long startBuff = 0L;
        long endBuff = 0L;

        // Buffered stream - used to read/write several bytes at a time.
        // the performance is faster than char stream and file input/output stream.
        try {

             scanner = new Scanner(new FileInputStream(readFile));
             printWriter = new PrintWriter(new FileWriter(writeFile));

             bufferedReader = new BufferedReader(new FileReader(readFile));
             bufferedWriter = new BufferedWriter(new FileWriter(writeFile));

              startScan = System.currentTimeMillis();
            String line  = scanner.nextLine();
            while(scanner.hasNextLine()){

                if(counter%3==0){
                    printWriter.write(line);
                }
                line = scanner.nextLine();
                counter++;
            }

            endcSan = System.currentTimeMillis();
            counter = 1;

            startBuff = System.currentTimeMillis();
            line = bufferedReader.readLine();

            while (line != null){

                if(counter%3==0){
                    bufferedWriter.write(line);
                }
                line = bufferedReader.readLine();
                counter ++;
            }
            endBuff = System.currentTimeMillis();

        }catch (IOException e){

            System.err.println(e.getMessage());// print the error in red color, because we use error stream
        }finally {
            scanner.close();
            printWriter.close();

            bufferedReader.close();
            bufferedWriter.close();
        }
        System.out.println("The difference between two streams are(in milliseconds:");
        System.out.println("Scanner: "+(endcSan - startScan));
        System.out.println("BufferedStream: "+(endBuff - startBuff));
    }
}
