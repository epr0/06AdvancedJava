package com.demo.exceptions;

public class ExceptionTester6 {

    public static void main(String[] args) {
        ExceptionTester6 exceptionTester6 = new ExceptionTester6();
        //Execute till exception is thrown
        //Since the loop is within the count menthod we can not continue
        //After the exception

        try {
            exceptionTester6.count();
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());

        }


        //Refactor like this, so you can add continue after the exception is caught
        //And counting will continue
        for (int i = 0; i < 10; i++) {
            try {
                exceptionTester6.countWithoutLoop(i);
            } catch (CustomException ex) {
                System.out.println(ex.getMessage());
                continue;
            }

        }

    }

    public void countWithoutLoop(int i) throws CustomException {
        if(i == 7) {
            throw new CustomException("Nemoku istarti 7");
        }
        System.out.println(i);
    }

    public void count() throws CustomException {
        for (int i = 0; i < 10; i++) {
            if(i == 7) {
                throw new CustomException("Nemoku istarti 7");
            }
            System.out.println(i);
        }
    }
}
