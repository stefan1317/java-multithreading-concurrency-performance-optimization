package org.coordination.example4;

import org.coordination.example4.threads.FactorialThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Long> inputNumbers = Arrays.asList(10000000L, 343L, 3212L, 232L, 32L, 4424L);

        List<FactorialThread> threads = new ArrayList<>();

        for (long i : inputNumbers) {
            threads.add(new FactorialThread(i));
        }

        for (Thread thread : threads) {
            thread.setDaemon(true);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < inputNumbers.size(); i++) {
            FactorialThread factorialThread = threads.get(i);

            if (factorialThread.isFinished()) {
                System.out.println("Factorial of " + inputNumbers.get(i) + " is " + factorialThread.getResult());
            } else {
                System.out.println("The calculation for " + inputNumbers.get(i) + " is still in progress.");
            }
        }

    }
}
