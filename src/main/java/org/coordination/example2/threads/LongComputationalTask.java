package org.coordination.example2.threads;

import java.math.BigInteger;

public class LongComputationalTask implements Runnable {
    private final BigInteger base;
    private final BigInteger power;

    public LongComputationalTask(BigInteger base, BigInteger power) {
        this.base = base;
        this.power = power;
    }

    @Override
    public void run() {
        System.out.println(base + "^" + power + "=" + pow(base,power));
    }

    private BigInteger pow(BigInteger base, BigInteger power) {
        BigInteger result = BigInteger.ONE;

        for (BigInteger i = BigInteger.ZERO; i.compareTo(power) <= 0; i = i.add(BigInteger.ONE)) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Thread is interrupted.");
                return BigInteger.ZERO;
            }
            result = result.multiply(base);
        }

        return result;
    }
}
