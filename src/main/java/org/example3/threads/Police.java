package org.example3.threads;

public class Police extends Thread{
    private final Thread[] threads;

    public Police(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(i + " seconds left!");
                sleep(1000);
            }

            for (Thread thread : threads) {
                thread.interrupt();
            }

            System.out.println("Police arrived!");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
