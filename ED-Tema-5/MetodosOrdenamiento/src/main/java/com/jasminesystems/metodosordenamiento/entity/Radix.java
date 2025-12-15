package com.jasminesystems.metodosordenamiento.entity;

public class Radix {

    public void ordenar(int[] array) {
        int max = obtenerMaximo(array);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            conteo(array, exp);
        }
    }

    private int obtenerMaximo(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    private void conteo(int[] array, int exp) {
        int n = array.length;
        int[] salida = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++)
            count[(array[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            salida[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            array[i] = salida[i];
    }
}
