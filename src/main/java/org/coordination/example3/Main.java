package org.coordination.example3;

import org.coordination.example3.threads.PowerCalculatingThread;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        PowerCalculatingThread thread1 = new PowerCalculatingThread(BigInteger.valueOf(22), BigInteger.valueOf(200));
        PowerCalculatingThread thread2 = new PowerCalculatingThread(BigInteger.valueOf(212), BigInteger.valueOf(423));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread1.getResult().add(thread2.getResult()));
    }
}
