package org.coordination.example1;

import org.coordination.example1.threads.BlockingTask;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());

        thread.start();
        thread.interrupt();
    }
}
