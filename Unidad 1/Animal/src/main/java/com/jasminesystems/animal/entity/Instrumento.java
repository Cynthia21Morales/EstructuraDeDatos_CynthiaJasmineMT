package com.jasminesystems.animal.entity;

public class Instrumento {
    public String tocar() {
        return "Suena un instrumento";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
