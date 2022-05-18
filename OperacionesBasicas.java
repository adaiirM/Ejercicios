package com.company;

public abstract class OperacionesBasicas {
    //Metodo abstracto
    public abstract float ResultadoOperacion();
    //toString
    public String toString() {
        return "Resultado de la operacion es:"+ ResultadoOperacion();
    }

}
