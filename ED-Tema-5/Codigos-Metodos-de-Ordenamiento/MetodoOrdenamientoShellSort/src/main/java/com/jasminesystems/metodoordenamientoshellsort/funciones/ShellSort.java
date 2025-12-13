package com.jasminesystems.metodoordenamientoshellsort.funciones;

public class ShellSort {

    private StringBuilder pasos = new StringBuilder();

    public String ordenar(int[] arreglo) {
        pasos.setLength(0);
        int n = arreglo.length;

        // Secuencia de incrementos (gap)
        for (int gap = n / 2; gap > 0; gap /= 2) {
            pasos.append("Gap = ").append(gap).append("\n");

            for (int i = gap; i < n; i++) {
                int temp = arreglo[i];
                int j = i;

                while (j >= gap && arreglo[j - gap] > temp) {
                    arreglo[j] = arreglo[j - gap];
                    j -= gap;
                }

                arreglo[j] = temp;
                pasos.append(arregloToString(arreglo)).append("\n");
            }
            pasos.append("\n");
        }
        return pasos.toString();
    }

    private String arregloToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            sb.append(n).append(" ");
        }
        return sb.toString();
    }
}






















