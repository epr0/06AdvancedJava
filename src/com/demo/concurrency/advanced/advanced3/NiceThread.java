package com.demo.concurrency.advanced.advanced3;

public class NiceThread extends Thread {

    private int startIndex, numberOfThreads, maxIndex;

    public NiceThread(int startIndex, int numberOfThreads, int maxIndex)
    {
        this.startIndex = startIndex;
        this.numberOfThreads = numberOfThreads;
        this.maxIndex = maxIndex;
    }

    @Override
    public void run()
    {
        for(int i = this.startIndex; i < this.maxIndex; i += this.numberOfThreads)
        {
            System.out.println("[ID " + this.getId() + "] " + i);
        }
    }
}
