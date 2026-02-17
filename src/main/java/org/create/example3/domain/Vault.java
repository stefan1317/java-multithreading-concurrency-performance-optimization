package org.create.example3.domain;

import java.util.Random;

public class Vault {
    private static final int password = new Random().nextInt(1000);

    public boolean crackPassword(int i) {
        return password == i;
    }
}
