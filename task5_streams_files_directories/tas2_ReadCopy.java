package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task5_streams_files_directories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class tas2_ReadCopy {
    public static void main(String[] args) {
        String raadFile = "";
        String copyFile = "";
        try {

            FileInputStream fileInputStream = new FileInputStream(raadFile);
            FileOutputStream fileOutputStream = new FileOutputStream(copyFile);

            int oneByte = fileInputStream.read();
            while (oneByte >= 0){

                if(oneByte == 32 || oneByte == 10){
                    fileOutputStream.write(oneByte);
                } else{

                    String digits = String.valueOf(oneByte);
                    for(int i=0;i<digits.length();i++){
                        fileOutputStream.write(digits.charAt(i));
                    }
                }
                oneByte = fileInputStream.read();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
