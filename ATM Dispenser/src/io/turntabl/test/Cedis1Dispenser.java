package io.turntabl.test;

public class Cedis1Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 1){
            int num = currency.getAmount()/1;
            int remainder = currency.getAmount() % 1;
            System.out.println("Dispensing "+num+" 1GHC note");
            if(remainder !=0) this.dispenseChain.dispense(new Currency(remainder));
        }else{
            this.dispenseChain.dispense(currency);
        }
    }
}
