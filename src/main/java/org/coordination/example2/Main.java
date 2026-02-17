package org.coordination.example2;

import org.coordination.example2.threads.LongComputationalTask;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new LongComputationalTask(new BigInteger("1000000000"), new BigInteger("120000000002")));

        thread.setDaemon(true);

        thread.start();
        thread.interrupt();
    }
}
