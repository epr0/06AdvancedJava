package com.demo.annotations.exmple1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
public @interface MyCoolAnnotation {
    int studentAge() default 18;
    String studentName();
    String studentAddress();
    String studentStream() default "SDA";
}
