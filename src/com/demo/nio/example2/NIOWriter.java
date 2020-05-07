package com.demo.nio.example2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class NIOWriter {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/epro/Downloads/Courses SDA/06 Advanced java/DemoProject/src/com/demo/io/example1/data.txt");
        List<String> fileLines = Arrays.asList("first line", "second line");
        Files.write(path, fileLines);
    }
}
