package org.loopsexercises;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int result = 1;
        int factorial = 5;
        for(var i = 1; i <= factorial; i++) {
          result = result * i;
        }
        System.out.println("Resultado: " + result);
    }

    public BigInteger getFactorial(int numberToCalculateFactorial) {
        BigInteger factorialResult = BigInteger.ONE;
        for(var i = 1; i <= numberToCalculateFactorial; i++) {
            factorialResult = factorialResult.multiply(BigInteger.valueOf(i));
        }
        return factorialResult;
    }
}
