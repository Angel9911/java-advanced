package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task5_streams_files_directories;

import java.io.Serializable;

public class Cube implements Serializable {

    private String color;
    private int width;
    private int length;
    private int depth;

    public Cube(String color, int width, int length, int depth) {
        this.color = color;
        this.width = width;
        this.length = length;
        this.depth = depth;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
