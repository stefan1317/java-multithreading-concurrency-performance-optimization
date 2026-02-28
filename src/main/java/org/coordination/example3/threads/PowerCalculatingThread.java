package org.coordination.example3.threads;

import java.math.BigInteger;

public class PowerCalculatingThread extends Thread {
    private BigInteger result = BigInteger.ONE;
    private final BigInteger base;
    private final BigInteger power;

    public PowerCalculatingThread(BigInteger base, BigInteger power) {
        this.base = base;
        this.power = power;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.power.intValue(); i++) {
            result = result.multiply(base);
        }
    }

    public BigInteger getResult() {
        return result;
    }
}