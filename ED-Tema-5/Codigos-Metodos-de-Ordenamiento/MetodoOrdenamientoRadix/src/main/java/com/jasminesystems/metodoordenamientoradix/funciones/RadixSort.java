package com.jasminesystems.metodoordenamientoradix.funciones;

import java.util.Arrays;

public class RadixSort {

    private StringBuilder pasos = new StringBuilder();

    public String ordenar(int[] arreglo) {
        pasos.setLength(0);

        int max = obtenerMaximo(arreglo);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            pasos.append("Ordenando por posición ").append(exp).append("\n");
            countingSort(arreglo, exp);
            pasos.append(Arrays.toString(arreglo)).append("\n\n");
        }
        return pasos.toString();
    }

    private void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] salida = new int[n];
        int[] contador = new int[10];

        for (int i = 0; i < n; i++) {
            contador[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            contador[i] += contador[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digito = (arr[i] / exp) % 10;
            salida[contador[digito] - 1] = arr[i];
            contador[digito]--;
        }

        System.arraycopy(salida, 0, arr, 0, n);
    }

    private int obtenerMaximo(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }
}


