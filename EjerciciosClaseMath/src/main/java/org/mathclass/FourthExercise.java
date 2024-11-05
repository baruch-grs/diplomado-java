package org.mathclass;

public class FourthExercise {
    public static void main(String[] args) {
        double number1 = (Math.random() * 50) + 1;
        double number2 = (Math.random() * 50) + 1;
        System.out.printf("Numbers: " + number1);
        System.out.println(" " + number2);
        System.out.println("Round method: " + Math.round(number1));
        System.out.println("Round method: " + Math.round(number2));

        System.out.println("Floor method: " + Math.floor(number2));
        System.out.println("Floor method: " + Math.floor(number1));

        System.out.println("Ceil method: " + Math.ceil(number1));
        System.out.println("Ceil method: " + Math.ceil(number2));

    }
}
