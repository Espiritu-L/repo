package ejercios_inicial_java;

import java.util.Scanner;

public class ordenamientos {
        public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int n, aux, pos; 
        System.out.print("\nINGRESE LA DIMENCION DEL VECTOR: ");
        n = e.nextInt();
        int v[] = new int[n];
        System.out.print("\n VECTOR: ");
        for(int i = 0; i < n; i++){
            v[i] = (int)(Math.random()*20);
        }
        for(int i: v){
            System.out.print(i+" - ");
        }

        System.out.print("\n\n ORDENAMIENTO POR INSERCION\n --------------------------\n");

        System.out.print("\n ORDEN ASCENDENTE:  ");
        for(int i = 0; i<n; i++){
            pos = i;
            aux = v[i];
            while ((pos > 0) && (aux < v[pos - 1])) {  // condicion para ascendente
                v[pos] = v[pos - 1];
                pos--;
            }
            v[pos] = aux;
        }
       /// for mejorado
        for(int i: v){
            System.out.print(i+" - ");
        }

        System.out.print("\n\n ORDEN DESCENDENTE: ");
        for(int i = 0; i<n; i++){
            pos = i;
            aux = v[i];
            while ((pos > 0) && (v[pos-1] < aux)) {  /// condicion para descendente
                v[pos] = v[pos - 1];
                pos--;
            }
            v[pos] = aux;
        }
       
        for(int i: v){
            System.out.print(i+" - ");
        } System.out.println("\n");


        /* int n, aux; 
        System.out.print("\nINGRESE LA DIMENCION DEL VECTOR: ");
        n = e.nextInt();
        int v[] = new int[n];
        System.out.print("\n VECTOR: ");
        for(int i = 0; i < n; i++){
            v[i] = (int)(Math.random()*20);
        }
        for(int i: v){
            System.out.print(i+" - ");
        }
        System.out.print("\n ORDENAMIENTO BURBUJA\n");
        System.out.print("\n ORDEN ASCENDENTE: ");
        for(int i = 0; i < (n-1); i++){
            for(int j = 0; j < (n-1); j++){
                if(v[j] > v[j+1]){
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }

        for(int i: v){
            System.out.print(i+" - ");
        }
        System.out.print("\n ORDEN DESCENDENTE: ");
        for(int i = 0; i < (n-1); i++){
            for(int j = 0; j < (n-1); j++){
                if(v[j] < v[j+1]){
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }

        for(int i: v){
            System.out.print(i+" - ");
        }  */

        e.close();
    }
}
