package com.jasminesystems.metodosbusqueda;

public class BusquedaBinaria {
    public static int buscar(int[] arr, int clave) {
        int inicio = 0, fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arr[medio] == clave) return medio;
            if (arr[medio] < clave) inicio = medio + 1;
            else fin = medio - 1;
        }
        return -1;
    }

    public static String arregloToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) sb.append(num).append(" ");
        return sb.toString();
    }
}


