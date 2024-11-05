package org.operatorsclasses;

public class ThirdExercise {
    public static void main(String[] args) {
        int numberOne = 8, numberTwo = 2, temp;
        System.out.println("Value of number one before swap: " + numberOne);
        System.out.println("Value of number two before swap: " + numberTwo);

        temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;
        System.out.println("Value of number one after swap: " + numberOne);
        System.out.println("Value of number two after swap: " + numberTwo);

    }
}
