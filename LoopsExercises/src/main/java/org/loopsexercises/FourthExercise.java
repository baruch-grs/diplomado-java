package org.loopsexercises;

import org.loopsexercises.Dividers;
import org.loopsexercises.Factorial;
import org.loopsexercises.IsAPerfectNumber;

import java.util.Random;
import java.util.Stack;


public class FourthExercise {
    public static void main(String[] args) {
        int finalNumber = 3;
        int resultOfIterations = 0;
        int randomNumber = 0;
        Dividers dividers = new Dividers();
        Factorial factorial = new Factorial();
        resultOfIterations = sum(finalNumber);
        randomNumber = generateRandomNumber(resultOfIterations);


        System.out.println("Result of the sum of iterations " + resultOfIterations);
        System.out.println("SQRT of the result of iterations: " + Math.sqrt(resultOfIterations));
        System.out.println("Random number generated: " + randomNumber);
        System.out.println("Dividers of the result: " + dividers.getDividers(resultOfIterations));
        System.out.println("Factorial of the result number: " + factorial.getFactorial(resultOfIterations));
        System.out.println("Validation of if the result is a perfect number: " + IsAPerfectNumber.isPerfectNumber(resultOfIterations, dividers.getDividers(resultOfIterations)));
    }

    static int sum(int lastIteration) {
        int result = 0;
        for (int i = 0; i <= lastIteration; i++) {
            result = result + i;
        }
        return result;
    }

    static int generateRandomNumber(int upperbound) {
        int generatedRandomNumber = 0;
        Random randomNumber = new Random();
        generatedRandomNumber = randomNumber.nextInt(upperbound);
        return generatedRandomNumber;
    }

}
