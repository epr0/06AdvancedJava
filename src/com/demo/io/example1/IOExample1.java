package com.demo.io.example1;

import java.io.*;

public class IOExample1 {

    public static void main(String[] args) {
        File file = new File("/Users/epro/Downloads/Courses SDA/06 Advanced java/DemoProject/src/com/demo/io/example1/data.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String fileLine;
            System.out.println("Printing out file contents below:");
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
