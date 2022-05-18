package ej2;

public class Main {
    public static void main(String[] args) {
         int[] a = {6,5,-9};
         int[] b = {4,3,13};
         int[] a2 = new int[3];
         int[] b2 = new int[3];
         int[] r = new int[3];
        //Multiplicar por el segun elemento
         for(int i = 0; i < 3; i++){
             a2[i] = a[i] * (b[1]);
             b2[i] = b[i] * (a[1]);
         }
         //Ciclo para restar las ecuaciones
         for(int i = 0; i < 3; i++){
            r[i] = a2[i] - b2[i];
         }

        int v1 = r[2] / r[0];
         //Despejar la segunda incognita
        int v2 = (a[2]-(a[0] * v1))/a[1];
        System.out.println("El valor de x: "+v1+"\nEl valor de y: "+v2);
    }
}

