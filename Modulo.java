package com.company;

public class Modulo extends OperacionesBasicas{
    private float[] arr;
    //Constructor
    public Modulo(float[] numeros) {this.arr = numeros;}

    @Override
    public float ResultadoOperacion() {
        return arr[0] % arr[1];
    }
}
