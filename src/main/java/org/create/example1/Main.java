package org.create.example1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        createThread();
        createThreadMisbehave();
    }

    private static void createThread() throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("We are now in the thread " + Thread.currentThread().getName());
            System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
        });

        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in the thread " + Thread.currentThread().getName() + " before starting a new thread");
        thread.start();
        System.out.println("We are in the thread " + Thread.currentThread().getName() + " after starting a new thread");

        Thread.sleep(1000);
    }

    private static void createThreadMisbehave() {
        Thread thread = new Thread(() -> {
            throw new RuntimeException("Intentional Exception");
        });

        thread.setName("Misbehaving Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        thread.setUncaughtExceptionHandler((t, e) ->
                System.out.println("A critical error happened in thread " + t.getName() + " the error is " + e.getMessage()));

        thread.start();
    }
}