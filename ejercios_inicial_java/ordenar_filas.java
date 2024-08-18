package ejercios_inicial_java;

import java.util.Arrays;
import java.util.Scanner;

public class ordenar_filas {
    // funcion para ordenar cada fila
    static int[] ordenar(int v[]){
        Arrays.sort(v);
        return v;
    }

    // funcion para mostrar
    static void mostrar(int f, int c, int m[][]){
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){
                System.out.print("  "+m[i][j]);
            } System.out.println();

        }
    }

    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int m[][], v[], f, c, rd = 0;
        System.out.print("\nINGRESE TAMANIO DE FILA: ");
        f = e.nextInt();
        System.out.print("\nINGRESE TAMANIO DE COLUMNAS: ");
        c = e.nextInt();
        m = new int[f][c];
        v = new int[c];
        // ingresar los elementos a la matris
        /* 
        System.out.println("INGRESE LOS ELEMENTOS A LA MATRIS");
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){
                m[i][j] = e.nextInt();
            }
        }*/
        // para ingresar con numeros aleatorios
       // Random rd = ramdon();
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){
                rd = (int) (Math.random() * 11) + 20;
                m[i][j] = rd;
            }
        }
        // mostrar la matriz
        System.out.println("MATRIZ ORIGINAL");
        mostrar(f,c,m);
        // ordenamos fila por fila
        for(int i=0; i<f; i++){
            v = ordenar(m[i]);
            for(int j=0; j<c; j++){
                // asiganar los valores ordenas a la matriz
                m[i][j] = v[j];
            }

        }
        System.out.println("MATRIZ CON FILAZ ORDENADAS");
        mostrar(f, c, m);
        e.close();
    }
    
}
