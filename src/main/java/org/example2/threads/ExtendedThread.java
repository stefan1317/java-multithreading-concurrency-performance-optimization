package org.example2.threads;

public class ExtendedThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from " + this.getName());
    }
}
