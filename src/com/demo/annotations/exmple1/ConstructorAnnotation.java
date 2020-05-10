package com.demo.annotations.exmple1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
Annotation basically is metadata.
Annotations are primarily used by code that is inspecting other code.
 They are often used for modifying (i.e. decorating or wrapping)
 existing classes at run-time to change their behavior.
 Frameworks such as JUnit and Hibernate use annotations to minimize the
 amount of code you need to write yourself to use the frameworks.
 */
@Target({ElementType.CONSTRUCTOR})
public @interface ConstructorAnnotation {
}
