package ejercios_inicial_java;

import java.util.Scanner;

public class matriz_traspuesta {
        public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int n;
        
        do{
            System.out.print("\n Ingrese el tamanio de la matriz [ n impar ]  ");
            n = e.nextInt();

        }while(n%2==0);

        int m[][] = new int[n][n];
        int fi=0, ff=n-1;
        int ci=0, cf=n-1, c=1;
        while (c<=n*n) {
            // llenado de la parte superior de derecha a izquierda
            for(int i=ci; i<=cf; i++){
                m[fi][i] = c++;
            } fi++;

            // llenado de la culumna izquierda de arriba hacia abajo
            for(int i=fi; i<=ff; i++){
                m[i][cf]=c++;
            } cf--;

            // llenado de la parte inferior de izquierda a derecha
            for(int i=cf; i>=ci; i--){
                m[ff][i] = c++;
            } ff--;

            // llenado de la columna derecha de abajo hacia arriba
            for(int i=ff; i>=fi; i--){
                m[i][ci] = c++;
            } ci++;

        }
        System.out.println("\n\t IMPRIMIENDO LA MATRIZ ESPIRAL \n");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%-4d",m[i][j]); // para imprimir con formato
            }System.out.println("\n");
        }
        //comprobar si una matriz es simetrica o no
        /* 
        int fila, columna;
        System.out.print("\n INGRESE EL TAMANIO DE FILAS: "); fila = e.nextInt();
        System.out.print("\n INGRESE EL TAMANIO DE COLUMNAS: "); columna = e.nextInt();

        int m[][] = new int[fila][columna];

        System.out.print("\n LLENADO DE LA MATRIZ \n");

        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                m[i][j] = e.nextInt();
            }
        }

        boolean simetrica = true;

        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                if(m[i][j] != m[j][i]){
                    simetrica = false;
                    break;
                } 
            }
            if(simetrica == false){
                break;
            }
        }

        if(simetrica == true){
            System.out.println("\n LA MATRIZ ES SIMETRICA \n");
        } else {
            System.out.println("\n LA MATRIZ NO ES SIMETRICA \n");
        }
     */
        e.close();
    }
}
