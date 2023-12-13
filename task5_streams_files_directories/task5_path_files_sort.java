package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task5_streams_files_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeSet;

public class task5_path_files_sort {
    public static void main(String[] args) throws IOException {

        String pathIn = "E:\\Programs\\SpringAngularProject\\angular7-springboot-crud-tutorial-master\\Interview-tasks\\src\\interview_tasks_paysafe\\object_oriented\\softuni\\java_advanced\\task5_streams_files_directories\\files\\task5_input";
        String outPut = "E:\\Programs\\SpringAngularProject\\angular7-springboot-crud-tutorial-master\\Interview-tasks\\src\\interview_tasks_paysafe\\object_oriented\\softuni\\java_advanced\\task5_streams_files_directories\\files\\task5_output";

        Path readPath = Paths.get(pathIn);
        Path writePath = Paths.get(outPut);

        List<String> getLines = Files.readAllLines(readPath);

        TreeSet<String> withoutEmptyLines = new TreeSet<>();
        for(String line: getLines){
            if(!line.equals("")){

                withoutEmptyLines.add(line);
            }
        }
        Files.write(writePath,withoutEmptyLines);
    }
}
