package org.create.example3.threads;

import org.create.example3.domain.Vault;

public class DescendingHacker extends Hacker {

    public DescendingHacker(Vault vault) {
        super(vault);
    }

    public void run() {
        for (int i = 1000; i >= 0; i--) {

            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (this.vault.crackPassword(i)) {
                System.out.println("Descending Hacker found the password!");
                System.exit(0);
            }
        }
    }
}
