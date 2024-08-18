package PRACTICAS_JAVA;

import java.util.Scanner;

public class matriz_traspuesta {
    // funcion para imprimir 
    static int[][] Traspues(int f, int c, int m2[][]){
        int[][] res = new int[c][f];

        for(int i=0; i<f; i++){
            for(int j=0;j<c; j++){
                res[j][i] = m2[i][j];
            }
        }

        return res;
    }

    // funcion para multiplicar la matriz original con la matriz traspuesta
    static int[][] Producto(int f, int c, int k, int m1[][], int m2[][]){
        int[][] res = new int [f][f];
        int suma=0;
        for(int i=0; i<f; i++){
            
            for(int j=0; j<c; j++){
                suma = 0;

                for(int h=0; h<k; h++){
                    suma+=m1[i][h]*m2[h][j];
                }

                res[i][j] = suma;

            }
        }

        return res;
    }
    static void mostrar(int f, int c, int m[][]){
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){
                System.out.print("  "+m[i][j]);
            }System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int m1[][], m2[][],m3[][], f, c, rd;
        f = e.nextInt();
        c = e.nextInt();
        m1=new int [f][c]; m2 = new int[c][f]; m3=new int[f][f];
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){
                rd = (int) (Math.random()*10) + 1;
                m1[i][j] = rd;
            }
        }
        
        mostrar(f, c, m1);
        System.out.println("MATRIZ TRASPUESTA");
        m2 = Traspues(f, c, m1);
        mostrar(c, f, m2);
        // llamando a la funcion producto
        System.out.println("PRODUCTO DE LA MATRIZ");
        // condicion para producto de matrices es la f = f al segundo parametro
        m3 = Producto(f, f, c, m1, m2);
        mostrar(f, f, m3);
        e.close();
    }
    
}
