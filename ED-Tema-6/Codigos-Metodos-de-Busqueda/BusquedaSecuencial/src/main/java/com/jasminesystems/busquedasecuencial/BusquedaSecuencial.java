package com.jasminesystems.busquedasecuencial;

public class BusquedaSecuencial {

    public static int busquedaSecuencial(int[] arr, int clave) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == clave) {
                return i; // Devuelve la posición donde se encontró la clave
            }
        }
        return -1; // Si no se encuentra, devuelve -1
    }

    public static String arregloToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}


