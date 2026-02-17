package org.coordination.example1.threads;

public class BlockingTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500000);
        } catch (InterruptedException e) {
            System.out.println("BlockingThread stopped.");
        }
    }
}
