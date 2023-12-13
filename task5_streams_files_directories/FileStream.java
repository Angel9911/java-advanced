package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task5_streams_files_directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FileStream {
    public static void main(String[] args) throws IOException {
        String path = "E:\\Programs\\SpringAngularProject\\angular7-springboot-crud-tutorial-master\\Interview-tasks\\src\\interview_tasks_paysafe\\object_oriented\\softuni\\java_advanced\\task5_streams_files_directories\\files\\input.txt";

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            int oneByte = fileInputStream.read();
            while (oneByte >= 0){
                System.out.println( (char)oneByte+" - " +oneByte);
                oneByte = fileInputStream.read();
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                fileInputStream.close();
            }
        }

        // make a change - skip punctuation and store it in a new existing file.
        String newChangeFilePath = "E:\\Programs\\SpringAngularProject\\angular7-springboot-crud-tutorial-master\\Interview-tasks\\src\\interview_tasks_paysafe\\object_oriented\\softuni\\java_advanced\\task5_streams_files_directories\\files\\input_skip_punctuation.txt";
        Set<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation,'.','!',',',':');
        try {
            FileInputStream readExistingFile = new FileInputStream(path);
            FileOutputStream writeNewFile = new FileOutputStream(newChangeFilePath);
            int oneByte = readExistingFile.read();
            while (oneByte >= 0){
                char getSymbol = (char)oneByte;
                if(!punctuation.contains(getSymbol)){
                    writeNewFile.write(getSymbol);
                }
                oneByte = readExistingFile.read();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                fileInputStream.close();
            }
        }
        System.out.println(" Output file after made a change in it(skip any punctuation). ");


        // or we can use try catch resource. Its a similar to the example above, but unlike it when using try catch resource
        // we don't care about closing a stream. If input stream open or couldn't open a stream of certain resource, automatically the stream is closed
        System.out.println(" Second way(binary nimber system: ");
        try(FileInputStream inputStream = new FileInputStream(path)) {
            int oneByte = inputStream.read();
            while (oneByte >= 0){
                String binaryNum = Integer.toBinaryString(oneByte);
                System.out.println(binaryNum);
                oneByte = inputStream.read();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
