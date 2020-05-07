package com.demo.io.example1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class IOExample2 {

    public static void main(String[] args) {
        File file = new File("/Users/epro/Downloads/Courses SDA/06 Advanced java/DemoProject/src/com/demo/io/example1/data.txt");
        List<String> names = Arrays.asList("Thomas", "Michael", "Rob", "Dennis");
        System.out.println("Writing to file....");
        for(String name : names) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                String fileLine = "\nAdded new line!";
                bufferedWriter.write(name + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done.");
    }
}
