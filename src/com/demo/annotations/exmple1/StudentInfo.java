package com.demo.annotations.exmple1;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
public @interface StudentInfo {
    int studentAge() default 18;
    String studentName();
    String studentAddress();
    String studentStream() default "SDA";
}
