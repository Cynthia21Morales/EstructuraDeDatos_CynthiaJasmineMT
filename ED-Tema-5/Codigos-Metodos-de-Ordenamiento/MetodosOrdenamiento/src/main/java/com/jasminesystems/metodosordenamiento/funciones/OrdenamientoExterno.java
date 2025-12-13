package com.jasminesystems.metodosordenamiento.funciones;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenamientoExterno {

    public static void ordenarArchivo(String archivoEntrada, String archivoSalida) throws IOException {
        List<Integer> numeros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                numeros.add(Integer.parseInt(linea));
            }
        }

        Collections.sort(numeros);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {
            for (int num : numeros) {
                bw.write(num + "\n");
            }
        }
    }
}


