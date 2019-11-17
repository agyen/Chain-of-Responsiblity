package io.turntabl.test;

public interface Chain {
    public void setNextChain(Chain nextChain);
    public  void  calculate(Numbers request);
}
