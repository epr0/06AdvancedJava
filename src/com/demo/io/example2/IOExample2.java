package com.demo.io.example2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOExample2 {

    public static void main(String[] args) {
        File file = new File("/Users/epro/Downloads/Courses SDA/06 Advanced java/DemoProject/src/com/demo/io/example1/data.txt");
        System.out.println("Lets write some content to a file");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            String fileLine = "\nAdded new line!";
            bufferedWriter.write(fileLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
