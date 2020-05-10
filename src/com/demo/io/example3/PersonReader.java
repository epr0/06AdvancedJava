package com.demo.io.example3;

import java.io.*;

public class PersonReader {

    public static void main(String[] args) throws FileNotFoundException {
        Person person = null;
        File file = new File("/Users/epro/Downloads/Courses SDA/06 Advanced java/DemoProject/src/com/demo/io/example3/personList.txt");


        try {
            FileInputStream fileInputStream= new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            person = (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(person.getFirstName() + " " +  person.getLastName());
    }
}
