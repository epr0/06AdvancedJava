package com.demo.annotations.exmple1;

public class MyTestClassMain {

    public static void main(String[] args) {

        Class<Student> object = Student.class;
        if(object.isAnnotationPresent(StudentInfo.class)){
            System.out.println("Annotation is present.");

            StudentInfo studentInfo = object.getAnnotation(StudentInfo.class);
            System.out.println("Student info from Annotation: ");
            System.out.println(studentInfo.studentName());
            System.out.println(studentInfo.studentAge());
            System.out.println(studentInfo.studentAddress());
            System.out.println(studentInfo.studentStream());

        }


    }
}
