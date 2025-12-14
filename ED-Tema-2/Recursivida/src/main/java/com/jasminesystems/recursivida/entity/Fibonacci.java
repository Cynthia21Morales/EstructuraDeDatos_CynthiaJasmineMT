package com.jasminesystems.recursivida.entity;

public class Fibonacci {

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
