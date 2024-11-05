package org.operatorsclasses;

import java.util.Arrays;

public class FirstExercise {
    public static void main(String[] args) {
        String studentName = "Baruch Guerra";
        int sum = 0, average;
        double[] notes = new double[5];

        for(var i = 0; i < notes.length; i++) {
            notes[i] = Math.floor(Math.random()*10) + 1;
        }

        for(double note: notes) {
            sum += (int)note;
        }
        average = sum/notes.length;
        System.out.println("Notes of the student: " + Arrays.toString(notes));
        System.out.println("Student: " + studentName);
        System.out.println("Average of the student: " + average);
    }
}
