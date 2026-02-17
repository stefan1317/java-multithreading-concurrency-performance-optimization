package org.create.example3.threads;

import org.create.example3.domain.Vault;

public abstract class Hacker extends Thread {
    public Vault vault;

    public Hacker(Vault vault) {
        this.vault = vault;
    }

    abstract public void run();
}
