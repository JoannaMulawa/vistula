package org.vistula.math;

public class Math {

    private int numberOne;
    private int numberTwo;

    public Math(){}

    public Math(int numberOne, int numberTwo) {

        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int multiply() {
        return  numberOne * numberTwo;

    }
    public int add() {
        return numberOne + numberTwo;
    }

    public int substraction() {
        return numberTwo - numberOne;
    }
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

}
