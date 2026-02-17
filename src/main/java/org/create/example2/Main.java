package org.create.example2;

import org.create.example2.threads.ExtendedThread;
import org.create.example2.threads.RunnableThread;

public class Main {
    public static void main(String[] args) {
        Thread extendedThread = new ExtendedThread();
        Runnable runnableThread = new RunnableThread();

        extendedThread.start();
        runnableThread.run();
    }
}