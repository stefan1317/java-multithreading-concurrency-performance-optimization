package org.example2.threads;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}
