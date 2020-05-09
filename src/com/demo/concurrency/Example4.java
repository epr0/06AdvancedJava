package com.demo.concurrency;

/*
New Thread creation: When a program calls the start() method,
a new thread is created and then the run() method is executed.
 But if we directly call the run() method then no new thread will be created and run()
  method will be executed as a normal method call on the current calling
   thread itself and no multi-threading will take place.


   As we can see in the above example, when we call the start()
    method of our thread class instance, a new thread is created with default
     name Thread-0 and then run() method is called and everything
      inside it is executed on the newly created thread.
 */
public class Example4 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        MyThread myThread3 = new MyThread();
        myThread3.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Current thread name: "
                + Thread.currentThread().getName());
        System.out.println("run() method called");
    }
}
