package com.demo.exceptions;

public class ExceptionTester7 {

    public void iWillThrowAnException() throws CustomException {
        System.out.println("Hello, now take the exception");
        throw new CustomException("Random error");
    }
}
