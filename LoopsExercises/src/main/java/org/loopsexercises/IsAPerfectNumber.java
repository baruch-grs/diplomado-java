package org.loopsexercises;

import java.util.Stack;
import org.loopsexercises.Dividers;

public class IsAPerfectNumber {
    public static void main(String[] args) {
        int numberToValidate = 8128;
        Dividers dividers = new Dividers();
        if(isPerfectNumber(numberToValidate, dividers.getDividers(numberToValidate))) {
            System.out.println(numberToValidate + " is a perfect number");
        } else {
            System.out.println("Is not a perfect number");
        }
    }

    public static boolean isPerfectNumber(int numberToValidate, Stack<Integer> dividers) {
        return sumDividers(dividers, numberToValidate) == numberToValidate;
    }
    static int sumDividers(Stack<Integer> dividers, int numberToValidate) {
        int result = 0;
        for (Integer divider : dividers) {
            if(divider != numberToValidate) result += divider;
        }
        return result;
    }
}
