package org.mathclass;

public class FirstExercise {
    int base = 2;
    int exponent = 3;
    static double pow(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        System.out.print(pow(base, exponent));
    }
}
