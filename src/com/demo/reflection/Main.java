package com.demo.reflection;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TestReflection testReflection = new TestReflection();
        //testReflection.show(); can't call private method

        Class c = Class.forName("com.demo.reflection.TestReflection");
        TestReflection reflectedInstance = (TestReflection) c.newInstance();

        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(reflectedInstance, null);

    }
}
