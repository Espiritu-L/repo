package ejercios_inicial_java;

import java.util.Scanner;

public class matrices1 {
      public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int c=1, n, m[][];
        System.out.print(" \n DIGITE LA DIMEMSION DE LA MATRIZ: ");
        n = e.nextInt();

        m = new int[n][n];

        int fi = 0, ff = n - 1;
        int ci = 0, cf = n - 1;

        while (c <= n*n) {
            for(int i = ci; i <= cf; i++){
                m[fi][i]=c++;
            } fi++;

            for(int i = fi; i <= ff; i++){
                m[i][cf]=c++;
            } cf--;

            for(int i = cf; i >= ci; i--){
                m[ff][i] = c++;
            } ff--;

            for(int i = ff; i >= fi; i--){
                m[i][ci] = c++;
            } ci++;
            
        }

        System.out.println("\n\t IMPRIMIENDO LA MATRIZ ESPIRAL\n");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%4d",m[i][j]);
            }System.out.println("\n");

        }

        


        /*int f, c;
        System.out.print(" \n    INGRESE EL TAMANIO DE LAS FILA: ");
        f = e.nextInt();
        System.out.print(" \n     INGRESE EL TAMANIO DE LA COLUMNA: "); 
        c = e.nextInt();

        int m[][] = new int[f][c];
        int m1[][] = new int[f][c];
        int s[][] = new int[f][c];


        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                m[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                m1[i][j] = (int)(Math.random()*10);
            }
        }
        //sumando las dos matrices
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                s[i][j] = m[i][j] + m1[i][j];
            }
        }

        System.out.println("\n\tIMPRIMIENDO LA MATRIZ GENERADA\n\t-------------------------------\n");
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                System.out.printf("%4d",m[i][j]);
            }System.out.println("\n");
        }

        System.out.println("\n\tIMPRIMIENDO LA MATRIZ GENERADA\n\t-------------------------------\n");
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                System.out.printf("%4d",m1[i][j]);
            }System.out.println("\n");
        }

        System.out.println("\n\tIMPRIMIENDO LA SUMA DE LA MATRIZ\n\t--------------------------------\n");
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                System.out.printf("%4d",s[i][j]);
            }System.out.println("\n");
        }*/

        e.close();
     }
}
