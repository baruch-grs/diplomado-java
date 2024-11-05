package org.mathclass;

import java.util.Arrays;

public class ThirdExercise {
    public static void main(String[] args) {
        double[] notes = new double[5];
        int sum = 0;
        int result = 0;
        for(var i = 0; i < notes.length; i++) {
            notes[i] = Math.floor(Math.random()*50) + 1;
        }

        for (double note : notes) {
            sum += (int) note;
        }
        result = sum / notes.length;
        System.out.println("Array of notes: "+ Arrays.toString(notes));
        System.out.println("Calculated Average: " + result);
    }
}
