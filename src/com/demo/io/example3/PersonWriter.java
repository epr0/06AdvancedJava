package com.demo.io.example3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonWriter {

    public static void main(String[] args) {
        Person person = new Person("Michael", "Dudikoff");
        File file = new File("/Users/epro/Downloads/Courses SDA/06 Advanced java/DemoProject/src/com/demo/io/example1/data.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
