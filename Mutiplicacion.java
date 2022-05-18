package com.company;

public class Mutiplicacion extends OperacionesBasicas{
    private float[] arr;
    private int tam;

    public Mutiplicacion(float[] numeros, int tam) {
        this.arr = numeros;
        this.tam = tam;
    }


    @Override
    public float ResultadoOperacion() {
        float r = arr[0];
        for (int i = 1; i < tam; i++) {
            r *= arr[i];
        }
        return r;
    }
}



