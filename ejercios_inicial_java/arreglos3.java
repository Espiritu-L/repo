package ejercios_inicial_java;

import java.util.Scanner;

public class arreglos3 {
        public static void main(String args[]){
        Scanner e = new Scanner(System.in);

        int n, v[];
        boolean c = false, d = false;
        System.out.print(" \n DIMENSION DEL ARRAY: ");
        n = e.nextInt();
        v = new int[n];
        System.out.print("\n INGRESE LOS ELEMENTOS DEL ARRAY \n");

        for(int i=0; i<n;i++){
            System.out.print("  "+(i+1)+".- => ");
            v[i] = e.nextInt();
        }

        for(int i = 0; i < (n-1); i++){
            if(v[i] < v[i+1]){ // 1 2 3 4 5 
                c = true;

            }else if(v[i] > v[i+1]){ // 5 4 3 2 1
                d = true;
            }
        }

        if(c == true && d == false){
            System.out.print("\n EL ARRAY ESTA EN FORMA CRECIENTE ");
        } else if(d == true && c == false){
            System.out.print("\n EL ARRAY ESTA EN FORMA DECRECIENTE ");
        } else if(c == true && d == true){
            System.out.print("\n EL ARRAY ESTA EN FORMA DESORDENADA ");
        } else{
            System.out.print("\n EL ARARY TIENE TODO LOS ELEMENTOS IGUALES");
        }
        //for mejorado en java
         /* 
        System.out.println(" IMPRIMIENDO CON FOR MEJORADO\n");
        for(int i: v){
            System.out.print("  "+i);
        }
        */
        
        int f=0;
        System.out.println("\n IMPRIMIENDO\n");
        for(int i = 0; i < n; i++){
            System.out.print("  " + v[i]);
            
            if(f<(n-1)){ System.out.print("  -"); f++; }
        } 
        e.close();
    }
}
