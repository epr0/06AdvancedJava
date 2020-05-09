package com.demo.concurrency;

public class StopWatchTester {

    public static void main(String[] args) {
        StopWatchThread stopWatch = new StopWatchThread("ADA");
        stopWatch.run();
    }
}
