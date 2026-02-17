package org.example3.threads;

import org.example3.domain.Vault;

public class AscendingHacker extends Hacker{

    public AscendingHacker(Vault vault) {
        super(vault);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (this.vault.crackPassword(i)) {
                System.out.println("Ascending Hacker found the password!");
                System.exit(0);
            }
        }
    }
}
