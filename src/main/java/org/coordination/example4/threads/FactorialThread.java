package org.coordination.example4.threads;

import java.math.BigInteger;

public class FactorialThread extends Thread {
    private final long inputNumber;
    private BigInteger result = BigInteger.ONE;
    private boolean isFinished = false;

    public FactorialThread(long inputNumber) {
        this.inputNumber = inputNumber;
    }

    @Override
    public void run() {
        this.result = factorial(inputNumber);
        this.isFinished = true;
    }

    private BigInteger factorial(long n) {
        BigInteger tempResult = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            tempResult = tempResult.multiply(BigInteger.valueOf(i));
        }

        return tempResult;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public BigInteger getResult() {
        return result;
    }
}