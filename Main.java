package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

	    System.out.print("Ingrese la cantidad de elementos a operar: ");
        int n = s1.nextInt();
        float[]a = new float[n];

        for(int c = 0; c < n; c++){
            System.out.print("\nIngresa el "+(c+1)+" numero: ");
            a[c] = s1.nextInt();
        }
        System.out.println("Menu de operaciones\n- Suma\n- Resta\n- Multiplicacion\n- Division\n- Modulo");
        System.out.print("Escribe la operacion que desees realizar: ");

        switch (s2.nextLine().toLowerCase()){
            case "suma":
                System.out.println("Suma");
                Suma s = new Suma(a, n);
                System.out.print(s);
                break;
            case "resta":
                System.out.println("Resta");
                Resta r = new Resta(a, n);
                System.out.print(r);
                break;
            case "multiplicacion":
                System.out.println("Multiplicacion\n");
                Mutiplicacion m = new Mutiplicacion(a, n);
                System.out.print(m);
                break;
            case "division":
                System.out.println("Division\n");
                Division d = new Division(a, n);
                System.out.print(d);
                break;
            case "modulo":
                if(n == 2){
                    System.out.println("Modulo\n");
                    Modulo mo = new Modulo(a);
                    System.out.println(mo);
                }else
                    System.out.println("ERROR - Ingresa solo dos valores");
                break;
            default:
                System.out.println("Operacion incorrecta");
                break;
        }
    }
}