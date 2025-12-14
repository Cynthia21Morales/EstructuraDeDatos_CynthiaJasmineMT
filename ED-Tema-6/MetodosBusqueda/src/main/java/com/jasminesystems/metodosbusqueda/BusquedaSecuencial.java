package com.jasminesystems.metodosbusqueda;

public class BusquedaSecuencial {

    public static int buscar(int[] arr, int clave) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == clave) {
                return i;
            }
        }
        return -1;
    }

    public static String arregloToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) sb.append(num).append(" ");
        return sb.toString();
    }
}


