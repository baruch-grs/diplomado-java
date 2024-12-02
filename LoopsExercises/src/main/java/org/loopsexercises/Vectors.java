package org.loopsexercises;

public class Vectors {
    public static void main(String[] args){
        double[] notas = new double[5];
        int porcentajes[] = {20, 10, 30, 20, 20};
        notas[0] = 4.5;
        notas[1] = 3.2;
        notas[2] = 5.0;
        notas[3] = 1.5;
        notas[4] = 4.3;
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio = ( notas[i] * (porcentajes[i]) / 100 ) + promedio;
        }
        System.out.println("Promedio final: " + Math.round(promedio));

    }
}
