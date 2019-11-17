package io.turntabl.test;

public class Cedis50Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50){
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50GHC note");
            if(remainder !=0) this.dispenseChain.dispense(new Currency(remainder));
        }else{
            this.dispenseChain.dispense(currency);
        }
    }
}
