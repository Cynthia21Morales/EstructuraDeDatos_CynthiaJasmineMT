package com.jasminesystems.metodoordenamientoquicksort.funciones;

public class QuickSort {

    private StringBuilder pasos = new StringBuilder();

    public String ordenar(int[] arreglo) {
        pasos.setLength(0);
        quicksort(arreglo, 0, arreglo.length - 1);
        return pasos.toString();
    }

    private void quicksort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int p = particion(arr, inicio, fin);

            pasos.append("Pivote ")
                    .append(arr[p])
                    .append(": ")
                    .append(arregloToString(arr))
                    .append("\n");

            quicksort(arr, inicio, p - 1);
            quicksort(arr, p + 1, fin);
        }
    }

    private int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivote) {
                i++;
                intercambiar(arr, i, j);
            }
        }
        intercambiar(arr, i + 1, fin);
        return i + 1;
    }

    private void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private String arregloToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            sb.append(n).append(" ");
        }
        return sb.toString();
    }
}


