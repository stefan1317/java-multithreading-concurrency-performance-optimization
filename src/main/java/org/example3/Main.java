package org.example3;

import org.example3.threads.AscendingHacker;
import org.example3.threads.DescendingHacker;
import org.example3.threads.Hacker;
import org.example3.threads.Police;
import org.example3.domain.Vault;

public class Main {
    public static void main(String[] args) {
        Vault vault = new Vault();

        Hacker ascendingHacker = new AscendingHacker(vault);
        Hacker descendingHacker = new DescendingHacker(vault);
        Police police = new Police(new Thread[]{ascendingHacker, descendingHacker});

        ascendingHacker.start();
        descendingHacker.start();
        police.start();
    }
}
