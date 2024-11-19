package org.loopsexercises;

import java.util.Stack;

public class Dividers {
    public static void main(String[] args) {
        int numberToFindDividers = 20;
        Stack<Integer> stackOfDividers = getDividers(numberToFindDividers);

        for(int divider: stackOfDividers) {
            System.out.println("Divider: " + divider);
        }
    }

    public static Stack<Integer> getDividers(int numberToFindDividers) {
        Stack<Integer> dividersStack = new Stack<>();
        for(int i = 1; i <= numberToFindDividers; i++){
            if (numberToFindDividers % i == 0) {
                dividersStack.push(i);
            }
        }
        return dividersStack;
    }
}
