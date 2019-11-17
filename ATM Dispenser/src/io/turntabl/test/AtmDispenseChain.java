package io.turntabl.test;

import java.util.Scanner;

public class AtmDispenseChain {

    private DispenseChain c1;

    public AtmDispenseChain() {
        // initialize the chain
        this.c1 = new Cedis50Dispenser();
        DispenseChain c2 = new Cedis20Dispenser();
        DispenseChain c3 = new Cedis10Dispenser();
        DispenseChain c4 = new Cedis5Dispenser();
        DispenseChain c5 = new Cedis2Dispenser();
        DispenseChain c6 = new Cedis1Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);
        c5.setNextChain(c6);
    }

    public static void main(String[] args) {
        AtmDispenseChain atmDispenser = new AtmDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
//            if (amount % 10 != 0) {
//                System.out.println("Amount should be in multiple of 10s.");
//                return;
//            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }

    }
}