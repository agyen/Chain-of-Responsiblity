package io.turntabl.test;

public class TestChain {

    public static void main(String[] args) {
        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubtractNumbers();
        Chain chain3 = new DivNumbers();
        Chain chain4 = new MultiplyNumbers();
        Chain chain5 = new Modulo();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain4.setNextChain(chain5);

        Numbers request = new Numbers(4,2, "modulo");

        chain1.calculate(request);
    }
}
