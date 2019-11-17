package io.turntabl.test;

public class Numbers {
    private  int number1;
    private  int number2;
    private String calcutionWanted;

    public Numbers(int number1, int number2, String calcutionWanted) {
        this.number1 = number1;
        this.number2 = number2;
        this.calcutionWanted = calcutionWanted;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalcutionWanted() {
        return calcutionWanted;
    }
}
