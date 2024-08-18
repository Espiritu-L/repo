package ejercios_inicial_java;

import java.util.Scanner;

public class Mespiral {
        public static void main(String[] args){
        Scanner e = new Scanner(System.in);

        int n;
        System.out.print(" \n INGRESE LA DIMENCION DE LA MATRIZ ");
        n = e.nextInt();
        int m[][] = new int[n][n];
        int aux = 0;
        for(int i = 0; i < n; i++){          
            for(int j = 0; j < n; j++){
                m[j][i] = (int)(Math.random()*10)+aux;
            }
            aux= aux + 10;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%6d",m[i][j]);
            } System.out.println("\n");
        }

        e.close();
    }
}
