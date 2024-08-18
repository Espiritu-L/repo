package PRACTICAS_JAVA;

import java.util.Scanner;

public class busqueda_binaria {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int n, v[];
        System.out.print("\n Tamanio del array: ");
        n = e.nextInt();
        v = new int[n];

        for(int i=0; i<n; i++){
            System.out.print(" \n Ingrese pos "+(1+i)+": ");
            v[i] = e.nextInt();
        }
        System.out.print("\n VECTOR ORDENADO");
        int pos, aux;
        for(int i=0;i < n; i++){
            for(int j = 0; j<n; j++){
                pos = i;
                aux = v[pos];

                while ((pos > 0) && (v[j+1] > aux)) {
                    aux = v[pos+1];
                }

            }
        }
        // declarando variables para busqueda binaria
        int c, mitad, primero, ultimo, x;
        primero =0;
        ultimo = n -1;
        x = 0;
        System.out.print("\n Numero a buscar: "); c = e.nextInt();

        while (primero <= ultimo && x == 0) {
            mitad = (primero + ultimo) / 2;
            // cuando lo encontramos el numero buscado en el array x = 1
            if(c == v[mitad]){
                x = 1;
            }
            if(c < v[mitad]){
                ultimo = mitad - 1;

            }
            if(c > v[mitad]){
                primero = mitad + 1;
            }
        }

        if(x==1){
            System.out.print("\n El numero se encuentra se encuentra en el array\n\n");
        } else {
            System.out.print("\n El numero no se encuentra\n\n");
        }

        e.close();
    }
    
}
