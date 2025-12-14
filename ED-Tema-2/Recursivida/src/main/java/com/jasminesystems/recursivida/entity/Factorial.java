package com.jasminesystems.recursivida.entity;

public class Factorial {
    public static int calcularFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }
}
