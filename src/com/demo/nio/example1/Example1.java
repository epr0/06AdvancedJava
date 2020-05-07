package com.demo.nio.example1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example1 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/epro/Downloads/Courses SDA/06 Advanced java/DemoProject/src/com/demo/io/example1/data.txt");

        List<String> fileLines = Files.readAllLines(path);
        List<String> fileLines1 = Files.readAllLines(path,
                Charset.forName("UTF-8"));
    }
}
