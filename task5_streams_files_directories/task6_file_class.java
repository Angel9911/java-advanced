package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task5_streams_files_directories;

import java.io.File;

public class task6_file_class {
    public static void main(String[] args) {

        File file = new File("E:\\Programs\\SpringAngularProject\\angular7-springboot-crud-tutorial-master\\Interview-tasks\\src\\interview_tasks_paysafe\\object_oriented\\softuni\\java_advanced\\task5_streams_files_directories\\files");

        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for(File getFile:files){
                    if(!getFile.isDirectory()){
                        System.out.printf(" %s and its lenght is %s",getFile.getName(),getFile.length());
                        System.out.println();
                    }else {
                        File[] getDirectoryFiles = getFile.listFiles();
                        if (getDirectoryFiles != null) {
                            for (File getDirectoryFile : getDirectoryFiles) {
                                if (!getDirectoryFile.isDirectory()) {
                                    System.out.printf(" %s and its lenght is %s", getDirectoryFile.getName(), getDirectoryFile.length());
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
